/* https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/

2520. Count the Digits That Divide a Number

Given an integer num, return the number of digits in num that divide num.
An integer val divides nums if nums % val == 0.

Example:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
*/


class Solution {
    public int countDigits(int num) {
        int n = num;
        int count =0;
        while(num!=0){
            int lastDigit = num%10;
            if(lastDigit!=0 && n%lastDigit==0) count++;
            num/=10;
        }
        return count;
    }
}
