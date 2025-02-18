/*Leetcode Question link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.
*/

class Solution {
    public int findNumbers(int[] nums) {
        int ans =0;
        for (int i = 0; i <nums.length ; i++) {
            int elem = nums[i];
            int count =0;
            while(elem>0){
                count++;
                elem = elem/10;
            }
            if(count %2 == 0){
                ans++;
            }
        }
        return ans;
    }
}