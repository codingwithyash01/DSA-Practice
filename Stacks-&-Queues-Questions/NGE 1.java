/*Leetcode Question link: https://leetcode.com/problems/next-greater-element-i/description/
496. Next Greater Element I

The next greater element of some element x in an array is the first greater element that is to the right of x
in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j]
and determine the next greater element of nums2[j] in nums2. If there is no next greater element,
then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
*/


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>(); // hashmap to store the num and its greater element
        int result[] = new int[nums1.length];

        for(int i =nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            int currResult = st.isEmpty()?-1:st.peek();
            map.put(nums2[i], currResult);
            st.push(nums2[i]);
        }

        for(int i =0;i<nums1.length;i++){
            result[i] = map.get(nums1[i]); // getting values from the hashmap for the values in nums1
        }
        return result;
    }
}