/*https://leetcode.com/problems/check-if-it-is-a-straight-line/description/

1232. Check If It Is a Straight Line

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

Example:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

*/
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0], yi = coordinates[i][1];

            if ((y1 - y0) * (xi - x0) != (yi - y0) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
}
