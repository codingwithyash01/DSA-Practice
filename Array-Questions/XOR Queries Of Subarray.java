/* LeetCode Question: https://leetcode.com/problems/xor-queries-of-a-subarray/description/

1310. XOR Queries of a Subarray

You are given an array arr of positive integers.
You are also given the array queries where queries[i] = [lefti, righti].

For each query i compute the XOR of elements from lefti to righti
Return an array answer where answer[i] is the answer to the ith query.

Example:

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8]

*/
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if(left==0) result[i] = prefix[right];
            else result[i]= prefix[right]^ prefix[left-1];
        }

        return result;
    }
}
