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
        ListNode newLastNode = null;
        int len =1;
        if( head == null || k == 0 ){
            return head;
        }

        while( tail.next != null ){
            len++;
            tail = tail.next;
        }

        if( k % len == 0){
            return head;
        }

        tail.next = head;
        
        k = k % len;
        k = len - k;
        int count = 1;
        while( head.next != null ){
            if( count == k ){
                newLastNode = head;
                break;
            }
            head = head.next;
            count++;
        }

        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }
}
