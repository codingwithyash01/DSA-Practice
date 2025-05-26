/* LeetCode Question link: https://leetcode.com/problems/majority-element/description/

169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example:

Input: nums = [3,2,3]
Output: 3

The algo that we are using here is Moor's voting algo.
*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = -1;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (nums[i] == element)
                count++;
            else
                count--;
        }
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element)
                count1++;
        }
        if (count1 > nums.length / 2)
            return element;
        else return -1;
    }
}