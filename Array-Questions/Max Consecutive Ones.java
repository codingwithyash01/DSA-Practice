/* https://leetcode.com/problems/max-consecutive-ones/description/
485. Max Consecutive Ones
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}