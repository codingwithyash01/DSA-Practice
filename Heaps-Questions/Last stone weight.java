/*Leetcode Question link: https://leetcode.com/problems/last-stone-weight/description/
1046. Last Stone Weight */
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxStone = new PriorityQueue<>(Collections.reverseOrder()); // creating max heap
        for (int num : stones) {
            maxStone.add(num); // adding array elements to the max heap
        }
        if (maxStone.size() < 2) {
            return maxStone.poll();
        } else {
            while (maxStone.size() > 1) {
                int first = maxStone.poll();
                int second = maxStone.poll();
                if (first != second) {
                    maxStone.add(first - second);
                }
            }
        }
        return maxStone.isEmpty()?0:maxStone.poll();
    }
}