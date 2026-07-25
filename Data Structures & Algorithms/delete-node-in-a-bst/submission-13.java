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
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        TreeNode curr=root;
        TreeNode prev=root;
         
        while(true){
            if(curr.val<key){
                if(curr.right!=null){
                    prev=curr;
                    curr=curr.right;
                }
                else{
                    return root;
                }
            }
            else if(curr.val==key){
                break;
            } 
            else if(curr.val>key){
                if(curr.left!=null){
                    prev=curr;
                    curr=curr.left;
                }
                else{
                    return root;
                }
            }
        }
        TreeNode temp=null;
        if(prev.right==curr){
            if(curr.left!=null){
                temp=curr.left;
            }
            if(curr.right==null){
                prev.right=curr.left;
            }
            else{
            curr=curr.right;
            prev.right=curr;
            // if(curr!=null){
            while(curr.left!=null){
                curr=curr.left;
            }
              curr.left=temp;
            temp=null;
            
            }
        }
        else if(prev==curr){
            if(prev.right!=null&&prev.left!=null){
                prev=prev.left;
                curr=curr.right;
                if(curr!=null){
                 while(curr.left!=null){
                curr=curr.left;
            }}
                curr.left=prev;
                root=root.right;
            }
            else if(prev.right!=null&&prev.left==null){
                root=root.right;
            }
            else if(prev.right==null&&prev.left!=null){
                root=root.left;}
            else{
                return null;
            
            }
        }
        else if(prev.left==curr){
             if(curr.left!=null){
                temp=curr.left;
            }
            if(curr.right==null){
                prev.left=curr.left;
            }
            else{
            curr=curr.right;
            prev.left=curr;

            // if(curr!=null){
            while(curr.left!=null){
                curr=curr.left;
            }
             curr.left=temp;
          
            temp=null;
            
            }
        }



        return root;
        }
    }
