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
    ArrayList<Integer> list = new ArrayList<>();
    
    while(end!=null){
        list.add(end.val);
        end=end.next;
    }
    int l=0;
    int r=list.size()-1;
    while(l<r){
        int one=list.get(l);
        int two=list.get(r);
        int sum=one+two;
        res=Math.max(sum,res);
        l++;
        r--;
    }
    return res;
    }
}