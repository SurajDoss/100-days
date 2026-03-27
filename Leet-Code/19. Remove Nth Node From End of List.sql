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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode currentNode = head;

        if( head == null){
            return head;
        }

        while( currentNode != null ){
            length++;
            currentNode = currentNode.next;
        }

        if( length == n){
            return head.next;
        }

        currentNode = head;

        for(int i =0; i < length - n - 1; i++){
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;
        return head;
    }
}
