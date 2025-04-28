/* LeetCode Question Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

1721. Swapping Nodes in a Linked List

You are given the head of a linked list, and an integer k.
Return the head of the linked list
after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
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
    public ListNode swapNodes(ListNode head, int k) {
        int len = findLength(head);
        ListNode first = findNode(head, k);
        ListNode last = findNode(head, len-k+1);

        int t= first.val;
        first.val = last.val;
        last.val=t;
        return head;
    }
    public int findLength(ListNode head){
        int count =0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode findNode(ListNode head, int k){
        ListNode node = head;
        for(int i=1;i<k;i++){
            node= node.next;
        }
        return node;
    }
}