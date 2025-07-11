/* https://leetcode.com/problems/3sum/description/

15. 3Sum

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.

The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
*/

// Approach: for this question we are using one fixed number along with two pointers to find the triplets

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i + 1, right = n - 1;
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if (total == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right && nums[left]==nums[left+1])left++;
                    while(left<right && nums[right]==nums[right-1])right--;

                    left++;
                    right--;
                } else if (total < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;
    }
}