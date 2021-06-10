package com.harvey.tree;

public class ForEachTreeNodeMain {
    public static void main(String[] args) {
        post(build());
        System.out.println();
    }

    protected static TreeNode build(){
        TreeNode root=new TreeNode(6,"a");
        TreeNode left =new TreeNode(3,"b");
        TreeNode right =new TreeNode(8,"c");
        TreeNode rightleft =new TreeNode(7,"d");
        TreeNode rightOfright =new TreeNode(12,"e");
        TreeNode rightOfrightofright =new TreeNode(17,"f");
        TreeNode rightOfrightofleft =new TreeNode(14,"j");

        root.setLeft(left);
        root.setRight(right);
        right.setLeft(rightleft);
        right.setRight(rightOfright);
        rightOfright.setRight(rightOfrightofright);
        rightOfrightofright.setLeft(rightOfrightofleft);
        return root;
    }

    public static void midle(TreeNode node){
        if(node == null){
            return;
        }else{
            midle(node.getLeft());
            System.out.println(node.toString());
            midle(node.getRight());
        }
    }

    public static void pre(TreeNode node){
        if(node==null)
            return;
        System.out.println(node.toString());
        TreeNode left=node.getLeft();
        if(left!=null) {
            pre(left);
        }
        TreeNode right = node.getRight();
        if(right!=null) {
            pre(right);
        }
    }

    public static void post(TreeNode node){
        if(node==null)
            return;
        post(node.getLeft());
        post(node.getRight());
        System.out.println(node.toString());

    }
}
