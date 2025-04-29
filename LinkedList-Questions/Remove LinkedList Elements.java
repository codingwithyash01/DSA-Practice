/* LeetCode Question Link: https://leetcode.com/problems/remove-linked-list-elements/description/

203. Remove Linked List Elements

Given the head of a linked list and an integer val,
remove all the nodes of the linked list that has Node.val == val, and return the new head.

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode tail = node;

        while(tail.next != null){
            if(tail.next.val == val){
                tail.next = tail.next.next;
            }
            else{
                tail= tail.next;
            }
        }
        return node.next;
    }
}