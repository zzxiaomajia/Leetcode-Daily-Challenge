/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int parent = root.val;

        int a = p.val;

        int b = q.val;

        if (a< parent && b< parent){

            return lowestCommonAncestor(root.left,p,q);

        }else if(a > parent && b > parent){

            return lowestCommonAncestor(root.right,p,q);

        }else{

            return root;
        }

    }
}