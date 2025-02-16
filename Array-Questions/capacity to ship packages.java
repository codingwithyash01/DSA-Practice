/*Leetcode Question Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

1011. Capacity To Ship Packages Within D Days

A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i].
Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship
that will result in all the packages on the conveyor belt being shipped within days days.
*/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if(weights[i]>max){
                max=weights[i];
            }
        }
        int low = max; // THE MINIMUM CAPACITY OF THE SHIP IS SHIPPING ATLEAST THE ITEM WITH THE MAX VALUE
        int high = sum; // THE MAXIMUM CAPACITY OF THE SHIP IS SHIPPING ALL THE ITEMS TOGETHER IN 1 DAY
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalDay = totalDays(weights, mid);
            if (totalDay <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static int totalDays(int arr[], int mid) {
        int load = 0;
        int day = 1;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > mid) {
                day = day + 1;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return day;
    }

}