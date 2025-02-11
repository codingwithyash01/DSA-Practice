/* Leetcode Question Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
81. Search in Rotated Sorted Array II*/
class Solution {
    public boolean search(int[] nums, int target) {
        boolean result = false;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = true;
                return result;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) { // eliminating duplicates
                start++;
                end--;
            } else if (nums[mid] <= nums[end]) { //checking, if the right half is sorted
                if (target >= nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else if (nums[start] <= nums[mid]) { //checking, if the left half is sorted
                if (target >= nums[start] && target <= nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return false;
    }
}