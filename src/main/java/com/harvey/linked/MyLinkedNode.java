package com.harvey.linked;

public class MyLinkedNode {
    private String val;
    private MyLinkedNode next;

    public MyLinkedNode(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public MyLinkedNode getNext() {
        return next;
    }

    public void setNext(MyLinkedNode next) {
        this.next = next;
    }

    public static MyLinkedNode build(){
        MyLinkedNode myLinkedNode=new MyLinkedNode("a");
        MyLinkedNode myLinkedNode2=new MyLinkedNode("b");
        MyLinkedNode myLinkedNode3=new MyLinkedNode("c");
        MyLinkedNode myLinkedNode4=new MyLinkedNode("d");
        MyLinkedNode myLinkedNode5=new MyLinkedNode("e");
        MyLinkedNode myLinkedNode6=new MyLinkedNode("f");


        myLinkedNode.setNext(myLinkedNode2);
        myLinkedNode2.setNext(myLinkedNode3);
        myLinkedNode3.setNext(myLinkedNode4);
        myLinkedNode4.setNext(myLinkedNode5);
        myLinkedNode5.setNext(myLinkedNode6);
        myLinkedNode6.setNext(myLinkedNode3);
        return myLinkedNode;
    }

    public static MyLinkedNode build2(){
        MyLinkedNode myLinkedNode=new MyLinkedNode("a");
        MyLinkedNode myLinkedNode2=new MyLinkedNode("b");
        MyLinkedNode myLinkedNode3=new MyLinkedNode("c");
        MyLinkedNode myLinkedNode4=new MyLinkedNode("d");
        MyLinkedNode myLinkedNode5=new MyLinkedNode("e");


        myLinkedNode.setNext(myLinkedNode2);
        myLinkedNode2.setNext(myLinkedNode3);
        myLinkedNode3.setNext(myLinkedNode4);
        myLinkedNode4.setNext(myLinkedNode5);
        return myLinkedNode;
    }
}
