/*Leetcode Question link: https://leetcode.com/problems/create-target-array-in-the-given-order/description/

1389. Create Target Array in the Given Order

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.
*/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            li.add(index[i], nums[i]);
        }
        int[] target = new int[li.size()];
        for(int i =0; i<target.length; i++){
            target[i] = li.get(i);
        }
        return target;
    }
}