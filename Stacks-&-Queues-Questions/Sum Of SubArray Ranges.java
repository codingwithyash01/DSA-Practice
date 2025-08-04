/*LeetCode Question Link: https://leetcode.com/problems/sum-of-subarray-ranges/description/

2104. Sum of Subarray Ranges

You are given an integer array nums. 
The range of a subarray of nums is the difference between the largest and smallest element in the subarray.
Return the sum of all subarray ranges of nums.
A subarray is a contiguous non-empty sequence of elements within an array.

Example:

Input: nums = [1,2,3]
Output: 4
*/

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum =0;
        for(int i =0;i<n;i++){
            int min = nums[i];
            int max = nums[i];
            for(int j =i;j<n;j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sum = sum + (long)(max-min);
            }

        }
        return sum;
    }
}