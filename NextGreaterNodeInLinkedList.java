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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> val=new ArrayList<>();
        while(head!=null){
            val.add(head.val);
            head=head.next;
        }
        int [] ans=new int[val.size()];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<val.size();++i){
            while(!stack.isEmpty() && val.get(stack.peek())<val.get(i)){
                ans[stack.peek()]=val.get(i);
                stack.pop();
            }
            stack.add(i);
        }
        return ans;
    }
}
