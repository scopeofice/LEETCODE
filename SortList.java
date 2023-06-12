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
    public ListNode sortList(ListNode head) {

        if(head==null){
            return null;
        }
        ListNode node=head;
        List<Integer> list=new ArrayList<>();
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        Collections.sort(list);
        ListNode n=new ListNode(list.get(0));
        head=n;
        ListNode temp=head;
        for(int i=1;i<list.size();i++){
            ListNode n1=new ListNode(list.get(i));
            temp.next=n1;
            temp=temp.next;
        }
        return head;


        // ListNode dummy=new ListNode(0,null);
        // dummy=head;
        // ListNode ptr1=dummy;
        // ListNode ptr2=dummy;

        // if(ptr1.val<ptr2.val){
        //     dummy.next=ptr1;
        //     ptr1=ptr1.next;
        //     dummy=dummy.next;
        // }
        // else{
        //     dummy.next=ptr2;
        //     ptr2=ptr2.next;
        //     dummy=dummy.next;
        // }
        // if(ptr1==null){
        //     dummy.next=ptr2;
        //     return dummy.next;
        // }
        // dummy.next=ptr1;
        // return dummy.next;
    }
}
