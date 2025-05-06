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
        ListNode temp=head;
        ListNode cur=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(n==count){
            return head.next;
        }
        int k=count-n-1;
        for(int i=0;i<k;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}