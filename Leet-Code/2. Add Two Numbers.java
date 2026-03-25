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
    public ListNode addTwoNumbers(ListNode F1, ListNode F2) {
        ListNode dummyList = new ListNode(-1);
        ListNode currentNode = dummyList;
        Integer carry = 0;

        while( F1 != null || F2 != null ){
            Integer sum = carry;
            if(F1 != null){
                sum = sum + F1.val;
            }
            if(F2 != null){
                sum = sum + F2.val;
            }

            ListNode newNode = new ListNode(sum%10);
            carry = sum / 10;

            currentNode.next = newNode;
            currentNode = newNode;

            if(F1 != null){ F1 = F1.next; }
            if(F2 != null){ F2 = F2.next; }
        }

        if( carry != 0 ){
            ListNode newNode = new ListNode(carry);
            currentNode.next = newNode;
        }

        return dummyList.next;
    }
}
