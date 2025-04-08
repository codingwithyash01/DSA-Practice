/*LeetCode Question link: https://leetcode.com/problems/spiral-matrix/
Given an m x n matrix, return all elements of the matrix in spiral order.
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        if (matrix.length == 0) {
            return li;
        }
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                li.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                li.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    li.add(matrix[i][left]);
                }
                left++;
            }

        }
        return li;
    }
}