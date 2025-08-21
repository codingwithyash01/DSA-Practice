/* LeetCode Question Link: https://leetcode.com/problems/invert-binary-tree/description/

226. Invert Binary Tree
Given the root of a binary tree, invert the tree, and return its root.

*/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}