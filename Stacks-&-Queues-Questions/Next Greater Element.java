/* GFG Question link: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

Given an array arr[ ] of integers, the task is to find the next greater element for each element of the array
in order of their appearance in the array.

Next greater element of an element in the array is the nearest element on the right which is
greater than the current element.

If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

 */

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            li.add(-1);
        }

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }

            int result = st.isEmpty()?-1:st.peek();
            li.set(i, result);
            st.push(arr[i]);
        }
        return li;
    }
}