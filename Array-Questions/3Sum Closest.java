/* https://leetcode.com/problems/3sum-closest/description/

16. 3Sum Closest
Given an integer array nums of length n and an integer target,
find three integers in nums such that the sum is closest to target. Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closestSum - target))
                    closestSum = sum;
                if (sum < target)
                    left++;
                else
                    right--;
            }
        }
        return closestSum;
    }
}