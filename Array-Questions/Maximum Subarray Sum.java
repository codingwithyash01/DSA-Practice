/*LeetCode Question Link: https://leetcode.com/problems/maximum-subarray/description/

53. Maximum Subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

This algo is knows as kadane's algorithm and the idea of this algorithm is that, if the currSum<0, then don't take
it forward
*/

class Solution {
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            max= Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}