/* LeetCode Question Link: https://leetcode.com/problems/daily-temperatures/description/

739. Daily Temperatures

Given an array of integers temperatures represents the daily temperatures, 
return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer
temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
        
Example:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[] = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()] <temperatures[i] ){
                int prevIndex= st.pop();
                result[prevIndex]= i-prevIndex;
            }
            st.push(i);
        }

        return result;
    }
}