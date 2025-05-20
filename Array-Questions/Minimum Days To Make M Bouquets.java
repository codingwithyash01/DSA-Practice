/* LeetCode Question link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
1482. Minimum Number of Days to Make m Bouquets

Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
*/

class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        int low =Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int ans =-1;
        if(bloomDay.length<m*k) return -1;

        for(int day: bloomDay){
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            int totalBouquet = possibleDays(mid, bloomDay, k);
            if(totalBouquet>=m){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int possibleDays(int mid, int bloomDay[], int k) {
        int count = 0;
        int totalBouquets =0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                count++;
            } else {
                totalBouquets += count / k;
                count = 0;
            }
        }
        totalBouquets += count / k;
        return totalBouquets;
    }
}