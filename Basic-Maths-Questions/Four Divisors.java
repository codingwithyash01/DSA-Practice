/*https://leetcode.com/problems/four-divisors/

1390. Four Divisors

Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors.
If there is no such integer in the array, return 0.

Input: nums = [21,4,7]
Output: 32
Explanation:
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.

*/
class Solution {

    public int sumFourDivisors(int[] nums) {
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum+= checkDivisor(nums[i]);
        }
        return sum;
    }
    public int checkDivisor(int n){
        int count=0;
        int sum =0;
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                count++;
                sum+=i;
                if((n/i)!=i){
                    count++;
                    sum+=n/i;
                }
                if(count>4) return 0;
            }
        }
        return count==4?sum:0;
    }
}