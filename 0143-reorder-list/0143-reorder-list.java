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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        //ListNode reversed = tailHead;
        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode tailHead = reverseList(slow.next);
        slow.next = null;

        //ListNode cur = head;
        //ListNode curReverse = tailHead;
/*
        while(cur != null && curReverse != null){
            ListNode temp = cur.next;
            cur.next = curReverse;
            ListNode tempReverse = curReverse.next;
            curReverse.next = temp;
            cur = temp;
            curReverse = tempReverse;
        }*/
        while(tailHead != null){
            ListNode temp = head.next;
            head.next = tailHead;
            tailHead = temp;
            head = head.next;
        }   

    }
    /*
    public ListNode findMiddleNode(){

    } */

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;

        while(next != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        cur.next = prev;
        return cur;   
    }
}