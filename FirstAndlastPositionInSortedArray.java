/*
Question link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ar[] = new int[2];
        ar[0] = ar[1] = -1;
        int i,j,c=0;
        for(i=0;i<nums.length;i++)
        {
            if(c == 0 && nums[i] == target)
            {
                c = 1;
                ar[0] = i;
            }
            if(c == 1 && nums[i] == target)
            {
                ar[1] = i;
            }
        }
        return ar;
    }
}
