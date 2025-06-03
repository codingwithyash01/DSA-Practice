/* https://leetcode.com/problems/powx-n/description/

50. Pow(x, n)

Implement pow(x, n), which calculates x raised to the power n

Example:

Input: x = 2.00000, n = 10
Output: 1024.00000
*/

class Solution {
    public double myPow(double x, int n) {
        double ans =1.0;
        long m =(long)Math.abs((long)n);
        while(m>0){
            if(m%2==1){
                ans=ans*x;
                m=m-1;
            }
            else{
                m=m/2;
                x=x*x;
            }
        }
        if(n<0) ans= 1.0/ans;
        return ans;
    }
}