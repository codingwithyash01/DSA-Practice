/*
GFG Question Link: https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

Stock span problem
The stock span problem is a financial problem where we have a series of daily price quotes for a stock
and we need to calculate the span of stock price for all days.

The span arr[i] of the stocks price on a given day i is defined as the maximum number of consecutive days
just before the given day, for which the price of the stock on the given day is less than or equal to its price
on the current day.

Examples:

Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6] */

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            int result = st.isEmpty()?i+1: i-st.peek();
            li.add(result);
            st.push(i);
        }
        return li;
    }
}
// Here in this question instead of calculating the <= elements, we have directly took out the greater element.