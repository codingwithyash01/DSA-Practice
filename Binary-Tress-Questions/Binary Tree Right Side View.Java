/* LeetCode Question Link: https://leetcode.com/problems/binary-tree-right-side-view/

199. Binary Tree Right Side View

Given the root of a binary tree, imagine yourself standing on the right side of it,
return the values of the nodes you can see ordered from top to bottom.

Example:

Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
*/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i =0;i<level;i++){
                TreeNode currNode = queue.poll();
                if(i==level-1) result.add(currNode.val);

                if(currNode.left!=null) queue.add(currNode.left);
                if(currNode.right!=null) queue.add(currNode.right);
            }
        }
        return result;
    }
}