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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        int length = 1;
        if(head == null || k == 0){
            return head;
        }
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;
        tail.next = head;
        
        for (int i = 0; i < length - k; i++) {
            tail = tail.next;
            head = head.next;
        }
        tail.next = null;
            
        return head;

    }
}