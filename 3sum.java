/*
Question link - https://leetcode.com/problems/3sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i , low,high,sum;
        List<List<Integer>> output_arr = new LinkedList();
        for(i=0;i<nums.length-2;i++)
        {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1]))
            {
                low = i+1;
                high = nums.length-1;
                sum = 0-nums[i];
                
                while(low < high)
                {
                    if(nums[low]+ nums[high] == sum)
                    {
                        output_arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high] > sum)
                        high--;
                    else
                        low++;
                }
            }
        }
        return output_arr;
    }
}
