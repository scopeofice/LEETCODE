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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy= new ListNode();
        ListNode ans=dummy;
        int temp=0;
        while(list1 !=null){
            if(temp==a){
                while (list2 !=null){
                    ans.next=list2;
                    ans=ans.next;
                    list2=list2.next;
                }
                while(temp!=b+1){
                    list1=list1.next;
                    ++temp;
                }
            }
            ans.next=list1;
            ans=ans.next;
            list1=list1.next;
            ++temp;
        }
        return dummy.next;
    }
}
