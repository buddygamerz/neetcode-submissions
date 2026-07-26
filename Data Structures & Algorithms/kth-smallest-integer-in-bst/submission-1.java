/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public void inorder(TreeNode root,int s[],Vector<Integer>s1){
        if(root==null){
            return;
        }
        inorder(root.left,s,s1);
        if(s[0]==0){
            return;
        }
        s1.add(root.val);
        s[0]--;
        inorder(root.right,s,s1);
        

    }
    public int kthSmallest(TreeNode root, int k) {
        Vector<Integer>s1=new Vector<>(10);
        int[] s = {k};
        inorder(root,s,s1);
        int m=s1.remove(s1.size() - 1);
        return m;
    }
}
