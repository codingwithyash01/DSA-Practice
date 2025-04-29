/* Leetcode Question Link: https://leetcode.com/problems/merge-two-sorted-lists/

21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode first = list1;
        ListNode second = list2;

        while(first!= null && second!=null){
            if(first.val<=second.val){
                tail.next= first;
                first = first.next;
            }
            else{
                tail.next= second;
                second = second.next;
            }
            tail= tail.next;
        }
        if(first!=null){
            tail.next= first;
        }
        if(second!=null){
            tail.next= second;
        }
        return head.next;
    }
}