/*

Question Link - https://leetcode.com/problems/merge-intervals/
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

*/

class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals)
    {
        vector<vector<int>> mi;
        
        if(intervals.size() == 0)
            return intervals;
        
        sort(intervals.begin(),intervals.end());
        vector<int> tmp = intervals[0];//setting tmp value to first interval pair- (1,3)
        
        for(auto it : intervals)
        {
            if(it[0] <= tmp[1])
                tmp[1] = max(it[1],tmp[1]); //merging ex : (1 3),(2 6) - comapring 3 and                  2 if  2 < 3 then merge taking maximum of 2 rhs 3,6 , 6 is maximum so                          merged array - 1,6
            else
            {
                mi.push_back(tmp); //if there is no merging interval then pushing into                                      main array
                tmp = it;
            }               
            
        }
        mi.push_back(tmp);
        return mi;
        
        
    }
};
