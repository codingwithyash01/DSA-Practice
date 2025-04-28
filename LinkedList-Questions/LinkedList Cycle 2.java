/*LeetCode Question Link: https://leetcode.com/problems/linked-list-cycle-ii/description/

142. Linked List Cycle II

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if:
there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
It is -1 if there is no cycle. 

Note that pos is not passed as a parameter.

Do not modify the linked list.
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int len = findLength(head);
        if(len==0) return null;
        while(len>0){
            slow = slow.next;
            len--;
        }
        while(slow != fast){
            slow= slow.next;
            fast= fast.next;
        }
        return slow;
    }

    public int findLength(ListNode node){

        ListNode fast = node;
        ListNode slow= node;
        while(fast!= null && fast.next!=null){
            fast= fast.next.next;
            slow= slow.next;
            int length =0;
            if(slow==fast){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}