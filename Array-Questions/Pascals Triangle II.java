/* LeetCode Question Link: https://leetcode.com/problems/pascals-triangle-ii/description/

119. Pascal's Triangle II

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it

*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<= rowIndex; i++){
            list.add((int)calcPascal(rowIndex, i));
        }
        return list;

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