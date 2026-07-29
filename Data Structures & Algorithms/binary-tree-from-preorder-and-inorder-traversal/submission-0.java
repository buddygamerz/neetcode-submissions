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
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer,Integer>inmap=new HashMap<Integer,Integer>();
    for(int i=0;i<inorder.length;i++){
        inmap.put(inorder[i],i);//creating haSHMAP;
    }
    TreeNode root=buildT(preorder, inorder,0,preorder.length-1,0,inorder.length-1,inmap);
    return root;
    
}
TreeNode buildT(int[] preorder,int[] inorder,int prestart,int prend,int instart,int inend,Map<Integer,Integer> inmap){
    if(prestart>prend||instart>inend){
        return null;
    }
    TreeNode root=new TreeNode(preorder[prestart]);
    int inroot=inmap.get(root.val);
    int numsleft=inroot-instart;
    root.left=buildT(preorder,inorder,prestart+1,prestart+numsleft,instart,inroot-1,inmap);
    root.right=buildT(preorder,inorder,prestart+numsleft+1,prend,inroot+1,inend,inmap);
    return root;
}
}
