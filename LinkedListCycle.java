/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode temp=head;
        ListNode dummy=head;
       while(temp!=null && temp.next!=null){
           temp=temp.next.next;
           dummy=dummy.next;
           if(temp==dummy){
               return true;
           }
       }
       return false;
    }
}
