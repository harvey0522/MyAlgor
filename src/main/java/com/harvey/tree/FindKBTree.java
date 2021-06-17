package com.harvey.tree;

/**
 *       a
 *     /   \
 *    b     c
 *   /  \  / \
 *  d   e f   g
 */
public class FindKBTree {
    static int k=4;
    static String res;
    public static void main(String[] args) {
        TreeNode  node=ForEachTreeNodeMain.build2();
        ForEachTreeNodeMain.midle(node);
        midlefind(node);
        System.out.println(res);
    }

    public static void midlefind(TreeNode root){
        if(root==null)
            return ;
        midlefind(root.getRight());
        if(k==0)
            return;
        if(--k==0) {
            res = root.getName();
            return;
        }
        midlefind(root.getLeft());
    }


}
