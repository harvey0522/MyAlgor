package com.harvey.tree;

public class DFSBTree {
    public static void main(String[] args) {
        TreeNode  node=ForEachTreeNodeMain.build();
        System.out.println(getMaxDeep(node));
    }

    public static int getMaxDeep(TreeNode root){
        if(root==null)
            return 0;
        int left=getMaxDeep(root.getLeft());
        int right=getMaxDeep(root.getRight());
        int max=Math.max(left,right)+1;
        return max;
    }
}
