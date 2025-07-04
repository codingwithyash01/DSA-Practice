/* LeetCode Question: https://leetcode.com/problems/merge-intervals/

56. Merge Intervals

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

*/

class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) ->a[0]- b[0]);
        int n= intervals.length;
        for(int i =0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(ans.isEmpty() || start > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(start,end));
            }
            else{
                List<Integer> last = ans.get(ans.size()-1);
                last.set(1, Math.max(last.get(1), end));
            }
        }
        int result[][] = new int[ans.size()][2];
        for(int i =0;i<ans.size();i++){
            result[i][0]= ans.get(i).get(0);
            result[i][1]= ans.get(i).get(1);
        }
        return result;
    }
}