package com.harvey.linked;

/**
 * 365*6 =2000h
 * a->b->c->d->e->f
 * m->n->e->f-g
 * 返回e->f
 *思路：
 * 双指针 暴力解法
 *
 */
public class FirstCommonNode {
    public static void main(String[] args) {


        MyLinkedNode myLinkedNodeCommon1 =new MyLinkedNode("e");
        MyLinkedNode myLinkedNodeCommon2 =new MyLinkedNode("f");


        MyLinkedNode node11 = new MyLinkedNode("a");;
        MyLinkedNode node12 = new MyLinkedNode("b");;
        MyLinkedNode node13 = new MyLinkedNode("c");;
        node11.setNext(node12);
        node12.setNext(node13);
        node13.setNext(myLinkedNodeCommon1);

        MyLinkedNode node2=new MyLinkedNode("m");
        MyLinkedNode myLinkedNode2=new MyLinkedNode("n");
        node2.setNext(myLinkedNode2);
        myLinkedNode2.setNext(myLinkedNodeCommon1);
        myLinkedNodeCommon1.setNext(myLinkedNodeCommon2);

        MyLinkedNode myLinkedNode = commonNode(node11, node2);
        System.out.println(myLinkedNode.getVal());


    }

    public static MyLinkedNode commonNode(MyLinkedNode node1,MyLinkedNode node2){
        MyLinkedNode head1=node1;
        MyLinkedNode head2=node2;
        while(head1!=head2){
            head1=head1!=null?head1.getNext():node2;
            head2=head2!=null?head2.getNext():node1;
        }

        return head1;
    }
}
