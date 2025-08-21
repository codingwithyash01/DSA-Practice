/* LeetCode Question Link: https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
637. Average of Levels in Binary Tree

Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
Answers within 10-5 of the actual answer will be accepted.

*/


class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root== null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int currLevel= queue.size();
            double sum =0.0;
            for(int i =0;i<currLevel;i++){
                TreeNode currLevelNode = queue.poll();
                sum+= currLevelNode.val;
                if(currLevelNode.left!=null) queue.offer(currLevelNode.left);
                if(currLevelNode.right!=null) queue.offer(currLevelNode.right);
            }
            result.add(sum/currLevel);
        }
        return result;
    }
}