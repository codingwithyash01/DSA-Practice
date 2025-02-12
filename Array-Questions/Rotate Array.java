/* Leetcode Question Link: https://leetcode.com/problems/rotate-array/description/
189. Rotate Array */

class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        reverse(nums, 0, len-k-1);
        reverse(nums, len-k, len-1);
        reverse(nums,0, len-1);
    }
    public static int[] reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        return arr;
    }
}