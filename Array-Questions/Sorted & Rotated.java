/*Leetcode Question Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
33. Search in Rotated Sorted Array*/

class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2; // calculating the mid
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<=nums[end]){ //checking, if the right half is sorted
                if(target>=nums[mid] && target<=nums[end]){ 
                    start=mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else if(nums[start]<=nums[mid]){ //checking, if the left half is sorted
                if(target>=nums[start] && target<=nums[mid]){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}