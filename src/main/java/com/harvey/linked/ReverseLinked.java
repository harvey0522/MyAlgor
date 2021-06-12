package com.harvey.linked;

/**
 * a—b-c-d-null
 * pre=a next=c b.setnext(a) pre=b next=c
 * 1.以前做过这个题现在根本想不起来
 * 2.我应该怎么练习才能有解体思路? 多练习，总结
 * 链表、tree、图 递归。
 */
public class ReverseLinked {
    public static void main(String[] args) {
        MyLinkedNode node = MyLinkedNode.build2();
        //MyLinkedNode reverse=reverse(node);
        //MyLinkedNode reverse=reverseByRecursion(node);

       /* while (reverse!=null) {
            System.out.println(reverse.getVal());
            reverse=reverse.getNext();
        }*/

       reverseByRecursion2(node);
    }

    public static  MyLinkedNode reverse(MyLinkedNode head){
        MyLinkedNode pre=null;

        MyLinkedNode current=head;
        while(current!=null){
            MyLinkedNode next=current.getNext();
            current.setNext(pre);
            pre =current;
            current=next;

        }
        return pre;
    }

    public static MyLinkedNode reverseByRecursion(MyLinkedNode head){
        if(head==null || head.getNext()==null){
            return head;
        }
        MyLinkedNode newNode = reverseByRecursion(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newNode;

    }

    public static void reverseByRecursion2(MyLinkedNode head){
        if(head==null){
            return;
        }
        reverseByRecursion2(head.getNext());
        System.out.println(head.getVal());

    }
}

