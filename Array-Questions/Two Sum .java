/* Leetcode Question link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
167. Two Sum II - Input Array Is Sorted
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; // Using two pointer approach here, as the array is sorted
        int sum = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            sum = numbers[left] + numbers[right];
            if (sum == target) {
                break; // as there is exactly one solution
            } else if (sum > target) { // if the sum is greater than the target, then we need to reduce it
                right--;
            } else { // if the sum is lesser than the target, then we need to increase it
                left++;
            }
        }
        return new int[]{left+1, right+1};
    }
}