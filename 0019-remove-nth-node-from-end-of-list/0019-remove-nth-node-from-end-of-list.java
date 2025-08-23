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
        int k=0;
        ListNode temp=head;
        if(temp==null) return null;
        while(temp!=null){
            k++;
            temp=temp.next;
        }
        if(k==n){
            return head.next;
        }
        temp=head;
        for(int i=1;i<k-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}