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
    public ListNode partition(ListNode head, int x) {
        ListNode lessValues = new ListNode(0);
        ListNode higherValues = new ListNode(0);

        ListNode lessHead = lessValues;
        ListNode highHead = higherValues;

        while( head != null ){
            if( head.val < x ){
                lessHead.next = head;
                lessHead = lessHead.next;
            }else{
                highHead.next = head;
                highHead = highHead.next;
            }
            head = head.next;
        }

        highHead.next = null;
        lessHead.next = higherValues.next;

        return lessValues.next;
    }
}
