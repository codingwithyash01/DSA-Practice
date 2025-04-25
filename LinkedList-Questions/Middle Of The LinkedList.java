/* LeetCode Question Link: https://leetcode.com/problems/middle-of-the-linked-list/description/
876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Input: head = [1,2,3,4,5]
Output: [3,4,5]

Explanation: The middle node of the list is node 3.
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
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode node = head;
//        int size =0;
//        int n=0;
//        while(node!=null){
//            node= node.next;
//            size++;
//        }
//        n=size/2;
//        ListNode ans = findNode(n, head);
//        return ans;
//    }
//
//    public ListNode findNode(int index, ListNode dummy){
//        ListNode temp = dummy;
//        for(int i=0;i<index;i++){
//            temp= temp.next;
//        }
//        return temp;
//    }
//}

//The above approach is fine, but what if the interviewer ask us to do it in single pass, without using two loops,
//then in that case we can use fast and slow pointers

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}