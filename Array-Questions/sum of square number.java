/* Leetcode Question Link: https://leetcode.com/problems/sum-of-square-numbers/description/
        
633. Sum of Square Numbers

Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
Example:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
*/

class Solution {
    public boolean judgeSquareSum(int c) {
        long start =0;
        long end = (long)Math.sqrt(c);;
        long sum =0;
        boolean ans = false;
        while(start<=end){
            sum = (start*start) + (end*end);
            if(sum == c){
                ans = true;
                return ans;
            }
            else if(sum< c){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}