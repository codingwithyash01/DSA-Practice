/*LeetCode Question Link: https://leetcode.com/problems/rotate-image/description/
48. Rotate Image

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.
*/

//In the optimal approach, we will first transpose the matrix in place and then will reverse each row

class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        // Transposing in place
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i =0;i<n;i++){
            reverse(matrix[i]);
        }
    }

    // Reversing each row
    public void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}