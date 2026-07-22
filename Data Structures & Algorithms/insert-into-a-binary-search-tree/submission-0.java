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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode roo1=root;
        // if(val<root.val){
        //     roo=root.left;
        // }
        // else{
        //     roo=root.right;
        // }
        while(true){
            
            if(roo1.val<=val){
                if(roo1.right!=null){
                    roo1=roo1.right;
                }
                else{
                    roo1.right=new TreeNode(val);
                    break;
                }
        }
            else{
                if(roo1.left!=null){
                    roo1=roo1.left;
                }
                else{
                    roo1.left=new TreeNode(val);
                    break;
                }
            }

    }
       
        return root;
    }
}