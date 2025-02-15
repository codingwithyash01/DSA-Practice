/* LeetCode Question Link: https://leetcode.com/problems/sqrtx/description/

Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
*/

class Solution {
    public int mySqrt(int x) {
        int ans=1;
        int low = 1; // mimimum possible value
        int high = x; // maximum possible value
        int mid =-1;
        if(x==0 || x==1){ // handling edge cases for 0 and 1
            return x;
        }
        while(low<=high){
            mid = low + (high-low)/2;
            if((long)mid *mid <=(long)x){
                ans = mid; // it can be our possible answer
                low = mid+1; // looking for highest value that satisfies the condition
            }
            else if((long)mid * mid > high){
                high = mid-1;
            }
        }
        return ans;
    }
}