/*
 Link:https://leetcode.com/problems/find-peak-element/
A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
*/

class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums.length == 1)
           return 0;
        int mx = nums.length-1;
        for(int i=nums.length-1;i >=0 ;i--)
        {
            if(nums[i] > nums[mx])
                mx = i;
        }
        return mx;
    }
}
