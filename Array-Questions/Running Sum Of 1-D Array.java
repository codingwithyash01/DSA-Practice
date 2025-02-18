/* Leetcode Question Link: https://leetcode.com/problems/running-sum-of-1d-array/

1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int sum =0;
        for (int i = 0; i <nums.length ; i++) { // traversing the array element one by one and adding them in sum
            sum+= nums[i];
            nums[i] = sum;
        }
        return nums;

    }
}