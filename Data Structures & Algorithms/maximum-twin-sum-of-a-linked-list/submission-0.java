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
    int res=0;
    ListNode end=head;
   
    Deque<Integer>q=new ArrayDeque<>();
    while(end!=null){
        q.addLast(end.val);
        end=end.next;
    }
    while(!q.isEmpty()){
        int one=q.pollFirst();
        int two=q.pollLast();
        int sum=one+two;
        res=Math.max(sum,res);
    }
    return res;
    }
}