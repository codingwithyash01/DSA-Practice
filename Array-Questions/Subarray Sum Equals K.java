/* LeetCode Question: https://leetcode.com/problems/subarray-sum-equals-k/description/

560. Subarray Sum Equals K

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example:

Input: nums = [1,1,1], k = 2
Output: 2

*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum =0;
        int count =0;
        for(int i =0;i<nums.length;i++){
            prefixSum+= nums[i];
            if(map.containsKey(prefixSum-k))
                count+=map.get(prefixSum-k);
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}