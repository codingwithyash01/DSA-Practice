/*Leetcode Question Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
1464. Maximum Product of Two Elements in an Array*/
class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> maxP = new PriorityQueue<>(Collections.reverseOrder()); // creating max heap
        for(int num: nums){
            maxP.add(num); // adding the array elements to the max heap
        }
        int first = maxP.poll(); // taking out the first maximum element
        int second = maxP.poll(); // taking out the second maximum element
        return ((first-1)*(second-1));
    }
}