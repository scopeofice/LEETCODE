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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode revHead=head;
        ListNode next;
        while(revHead != null){
            next = revHead.next;
            revHead.next=prev;
            prev=revHead;
            revHead=next;
        }
            return prev;
    }

}
