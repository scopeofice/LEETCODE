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
        ListNode dummy=new ListNode();
        ListNode before=dummy;
        ListNode after=dummy;
        int i=0;
        dummy.next=head;
        while(i<n){
        after=after.next;
        i++;
    }
        while(after.next!=null){
            after=after.next;
            before=before.next;
        }
        before.next=before.next.next;
        return dummy.next;
    }
}
