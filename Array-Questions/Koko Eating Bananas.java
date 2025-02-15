/* Leetcode Question Link: https://leetcode.com/problems/koko-eating-bananas/description/
875. Koko Eating Bananas

Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k.
Each hour, she chooses some pile of bananas and eats k bananas from that pile.
If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
*/

import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; // minimum koko can eat 1 banana
        int high = maxBanana(piles); // maximum koko can eat the max value available in the pile
        int ans =1;
        while(low<=high){
            int mid= low + (high-low)/2;
            int total = totalHours(piles, mid); // checking if that mid value satisfies the condition
            if(total <=h){
                ans = mid;
                high=mid-1;

            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int maxBanana(int arr[]){ // finding out the maximum value
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int totalHours(int nums[], int mid){ // finding out the totalhours based on the mid value
        int total = 0;
        for(int i =0; i<nums.length;i++){
            total += Math.ceil((double)(nums[i])/(double)(mid)); // to take the ceil value
        }
        return total;
    }
}