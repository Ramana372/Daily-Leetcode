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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node=head;
        int c=0;
        while(node!=null && c<k){
            node=node.next;
            c++;
        }
        if(c<k)return head;
        ListNode prev=null, curr=head, next=null;
        for(int i=0;i<k;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
}