package com.harvey.tree;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;

    private String name;
    private Integer id;

    public TreeNode( Integer id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
