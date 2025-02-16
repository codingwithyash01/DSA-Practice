/* Leetcode Question Link: https://leetcode.com/problems/valid-perfect-square/description/

367. Valid Perfect Square

Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer.
In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
*/


class Solution {
    public boolean isPerfectSquare(int num) {
        boolean ans = false;
        int low =1; // THE NUMBER WILL ALWAYS LIES IN THIS RANGE FROM 1 TO N
        int mid =-1;
        int high = num/2; // WE CAN ALSO USE HIGH = N, BUT USING N/2 WILL ALSO WORK AND BETTER TC WILL COME
        if(num == 1){
            return true;
        }
        while(low<=high){
            mid = low + (high-low)/2;
            if((long)mid*mid == (long)num){
                ans= true;
                return ans;
            }
            else if((long)mid*mid <(long)num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}