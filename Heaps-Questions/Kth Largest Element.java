/*LeetCode Question: https://leetcode.com/problems/kth-largest-element-in-an-array/

215. Kth Largest Element in an Array

Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums){
            pq.add(num);
            if(pq.size()>k)
                pq.poll();
        }

        return pq.peek();
    }
}