/*Leetcode Question Link: https://leetcode.com/problems/cousins-in-binary-tree/description/

993. Cousins in Binary Tree

Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y,
return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
Two nodes of a binary tree are cousins if they have the same depth with different parents.
Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.

Input: root = [1,2,3,4], x = 4, y = 3
Output: false

*/


class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
     boolean result = true;
     if(root == null) return false;
     Queue<TreeNode> queue = new LinkedList<>();
     queue.offer(root);
     while(!queue.isEmpty()){
        int level = queue.size();
        boolean findX = false;
        boolean findY = false;
        for(int i =0;i<level;i++){
            TreeNode temp = queue.poll();
            if(temp.left!=null && temp.right!=null){
                if(temp.left.val == x && temp.right.val == y ||
                temp.left.val == y && temp.right.val == x ) return false;
            }

            if(temp.val==x) findX = true;
            if(temp.val==y) findY = true;


            if(temp.left!=null) queue.offer(temp.left);
            if(temp.right!=null) queue.offer(temp.right);
        }

        if(findX && findY) return true;

        }
        return false;
    }
}
