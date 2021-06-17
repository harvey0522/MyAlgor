package com.harvey.tree;

public class ReverseBTree {
    public static void main(String[] args) {
        TreeNode  node=ForEachTreeNodeMain.build2();
        ForEachTreeNodeMain.midle(node);
        System.out.println();
        ForEachTreeNodeMain.midle(reverse(node));
    }

    public static TreeNode reverse(TreeNode root){
        if(root==null)
            return root;
        TreeNode left=reverse(root.getLeft());
        TreeNode right= reverse(root.getRight());
        root.setLeft(right);
        root.setRight(left);
        return root;
    }
}
