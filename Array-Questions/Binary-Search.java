/* Question says: Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. Note: If multiple occurrences are there, please return the smallest index.*/
// Concept of Binary Search is used here
// Coding With Yash
class Solution {
    public int binarysearch(int[] arr, int k) {
        int start =0;
        int end = arr.length-1;
        int result =-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>k){
                end=mid-1;
            }
            else if(arr[mid]<k){
                start=mid+1;
            }
            else if(arr[mid]==k){
                result= mid;
                end = mid-1;
            }
            
        }
        return result;
    }
}