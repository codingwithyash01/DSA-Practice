/* https://leetcode.com/problems/find-k-closest-elements/
658. Find K Closest Elements

Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b

Example:

Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]

 */
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<int[]> pq= new PriorityQueue<>(
                (a,b)->{
                    if(b[0]!=a[0]) return b[0]-a[0];
                    else return b[1]-a[1];
                });
        for(int num:arr){
            pq.add(new int[]{Math.abs(num-x),num});
            if(pq.size()>k) pq.poll();
        }



        while(!pq.isEmpty()){
            result.add(pq.poll()[1]);
        }
        Collections.sort(result);
        return result;
    }
}