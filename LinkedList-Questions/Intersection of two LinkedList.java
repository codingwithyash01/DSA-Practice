/* LeetCode Question Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/

160. Intersection of Two Linked Lists
        
Given the heads of two singly linked-lists headA and headB,
return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headF = headA;
        ListNode headS = headB;

        if (headA == null || headB == null)
            return null;

        while (headF != headS) {
            headF = (headF == null) ? headB : headF.next;
            headS = (headS == null) ? headA : headS.next;
        }

        return headF;
    }
}