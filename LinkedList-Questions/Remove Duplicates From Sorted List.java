/* LeetCode Question Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.

Input: head = [1,1,2]
Output: [1,2]

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head== null){
            return head;
        }
        ListNode node = head;
        while(node.next!=null){
            if(node.val == node.next.val){
                node.next= node.next.next;
            }
            else{
                node= node.next;
            }
        }
        return head;
    }
}