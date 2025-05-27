/* LeetCode Question Link: https://leetcode.com/problems/pascals-triangle/description/

118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it:

For this question, we have used the formula of nCr but in a modified way that gives us the optimised solution

*/

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i<= numRows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j =1;j<=i;j++){
                list.add((int)calcPascal(i-1, j-1));
            }
            ans.add(list);
        }
        return ans;

    }
    public long calcPascal(int row, int col){
        long ans =1;
        for(int i =0;i<col;i++){
            ans =ans*(row-i);
            ans= ans/(i+1);
        }
        return ans;
    }
}