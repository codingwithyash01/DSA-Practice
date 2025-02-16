/* Leetcode Question Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

1283. Find the Smallest Divisor Given a Threshold

Given an array of integers nums and an integer threshold, 
we will choose a positive integer divisor, divide all the array by it, and sum the division's result.
Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
Each result of the division is rounded to the nearest integer greater than or equal to that element. 
(For example: 7/3 = 3 and 10/2 = 5).
*/

import java.util.*;
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxDivisor(nums);
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int total = totalThreshold(nums, mid);
            if (total <= threshold) {
                ans = mid;
                high = mid - 1;
            } else if (total > threshold) {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int maxDivisor(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int totalThreshold(int arr[], int num){
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum += Math.ceil((double)arr[i]/(double)num);
        }
        return sum;
    }
}