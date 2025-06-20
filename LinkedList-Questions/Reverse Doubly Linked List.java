// Reversing a Doubly linked list : https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1

class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode curr = head;
        DLLNode temp = null;
        while(curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr= curr.prev;
        }
        if(temp!=null){
            head= temp.prev;  // new head is the last node we processed
        }
        return head;
    }
}