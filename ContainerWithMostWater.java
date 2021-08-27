/*
Question link - https://leetcode.com/problems/container-with-most-water

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of 
the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
*/

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0 , diff;
        int left_pointer = 0;
        int right_pointer = height.length-1;
        
        while(left_pointer < right_pointer)
        {
            diff = right_pointer - left_pointer;
            if(height[left_pointer] < height[right_pointer])
            {     
                maxArea = Math.max(maxArea , (height[left_pointer]*diff));
                left_pointer += 1;
            }
            else
            {
                maxArea = Math.max(maxArea , (height[right_pointer]*diff));
                right_pointer -= 1;
            }
        }
        return maxArea;
    }
}
