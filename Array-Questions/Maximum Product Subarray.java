/*LeetCode Question Link: https://leetcode.com/problems/maximum-product-subarray/description/

152. Maximum Product Subarray

Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Example:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
*/

class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;;
        int prefix =1;
        int suffix=1;

        for (int i = 0; i < nums.length; i++) {
            if(prefix ==0) prefix =1;
            if(suffix==0) suffix=1;
            prefix *= nums[i];
            suffix*= nums[nums.length-i-1];


            maxProduct = Math.max(maxProduct, Math.max(prefix,suffix));
        }
        return maxProduct;
    }
}