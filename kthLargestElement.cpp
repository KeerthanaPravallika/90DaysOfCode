/*

Question link - https://leetcode.com/problems/kth-largest-element-in-an-array

Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
*/

class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        priority_queue<int , vector<int>,less<int>> pq;
        
        for(int i=0;i<nums.size();i++)
            pq.push(nums[i]);
        
        int k_large_num,count=1;
        while(!pq.empty())
        {
            if(count == k)
            {
                k_large_num = pq.top();
                break;
            }
            count++;
            pq.pop();
        }
        return k_large_num;
    }
};
