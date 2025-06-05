/* https://leetcode.com/problems/ugly-number/description/

263. Ugly Number

An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

Example:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3

*/

class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;

        for(int i =2;i<=5;i++){
            while(n%i==0 && (i==2 || i==3 || i==5)){
                n=n/i;
            }
        }
        return n==1;
    }
}