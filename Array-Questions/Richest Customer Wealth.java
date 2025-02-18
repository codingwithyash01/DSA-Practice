/* Leetcode Question Link: https://leetcode.com/problems/richest-customer-wealth/description/

1672. Richest Customer Wealth

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has
in the jth bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int i, j, sum=0;
        int max= 0;
        for (i = 0; i <accounts.length; i++) {
            for (j = 0; j <accounts[i].length; j++) {
                sum = sum+ accounts[i][j];
            }
            if(sum> max){
                max = sum;
            }
            sum =0;
        }
        return max;
    }
}