/* LeetCode Question Link: https://leetcode.com/problems/symmetric-tree/
101. Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
*/


class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i =0;i<level;i++){
                TreeNode node1 = queue.poll();
                TreeNode node2 = queue.poll();
                if(node1==null && node2==null) continue;
                if(node1==null || node2== null) return false;
                if(node1.val!=node2.val) return false;

                queue.offer(node1.left);
                queue.offer(node2.right);
                queue.offer(node1.right);
                queue.offer(node2.left);
            }
        }
        return true;
    }
}