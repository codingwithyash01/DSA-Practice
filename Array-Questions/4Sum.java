/* https://leetcode.com/problems/4sum/description/
18. 4Sum

Given an array nums of n integers, return an array of all the unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that: 0 <= a, b, c, d < n
a, b, c, and d are distinct.

nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

*/

// Approach: Here we are using two fixed number along with 2 pointers

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j =i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int left= j+1, right=n-1;
                while(left<right){
                    long total = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(total==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left<right && nums[left] == nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }
                    else if(total<target) left++;
                    else right--;
                }
            }
        }
        return result;
    }
}