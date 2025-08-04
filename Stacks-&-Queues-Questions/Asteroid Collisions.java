/* LeetCode Question Link: https://leetcode.com/problems/asteroid-collision/

735. Asteroid Collision

We are given an array asteroids of integers representing asteroids in a row.
The indices of the asteriod in the array represent their relative position in space.
For each asteroid, the absolute value represents its size, and the sign represents its direction
(positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions.
If two asteroids meet, the smaller one will explode. If both are the same size, both will explode.
Two asteroids moving in the same direction will never meet.

Example:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
*/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> li = new ArrayList<>();
        for (int asteroid : asteroids)
            li.add(asteroid);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < li.size()-1; i++) {
                int curr = li.get(i);
                int next = li.get(i + 1);
                if (curr > 0 && next < 0) {
                    if (Math.abs(curr) == Math.abs(next)) {
                        li.remove(i);
                        li.remove(i);
                    } else if (Math.abs(curr) > Math.abs(next))
                        li.remove(i + 1);
                    else
                        li.remove(i);
                    changed = true;
                    break;
                }
            }
        }
        int result[] = new int[li.size()];
        for(int i =0;i<li.size();i++){
            result[i]= li.get(i);
        }
        return result;
    }
}