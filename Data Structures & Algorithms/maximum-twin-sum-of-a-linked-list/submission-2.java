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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        fast=head;
        slow=prev;
        int res=0;
        while(slow!=null){
            int sum=fast.val+slow.val;
            fast=fast.next;
            slow=slow.next;
            res=Math.max(res,sum);
        }
        return res;
    }
}