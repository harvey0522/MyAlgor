package com.harvey.linked;

/**
 * 缺乏数学思维导致不懂里面的套路
 */
public class RemoveNode {
    public static void main(String[] args) {
        MyLinkedNode node = MyLinkedNode.build2();
        node =remoeNodeByLc(node,"c");
        //MyLinkedNode reverse=reverseByRecursion(node);

        while (node!=null) {
            System.out.println(node.getVal());
            node=node.getNext();
        }

    }

    //自己写的方法bug太多 第一次头尾节点删除异常
    @Deprecated
    public static  MyLinkedNode remove(MyLinkedNode head,String rmNode){
        MyLinkedNode pre=null,current=head;
        while(current!=null){
            MyLinkedNode next=current.getNext();
            if(current.getVal().equals(rmNode)) {
                if(pre!=null) {
                    pre.setNext(next);
                }{
                    current=next;
                }
                break;
            }else{
                pre=current;
                current=next;
            }
        }

        return current;
    }

    public static MyLinkedNode remoeNodeByLc(MyLinkedNode head,String val){
        if(head==null)
            return head;
        if(head.getVal().equals(val)){
            return head.getNext();
        }
        MyLinkedNode pre=head,current=head.getNext();
        while(current!=null && !current.getVal().equals(val)){
            pre=current;
            current=current.getNext();
        }
        if(current!=null)
            pre.setNext(current.getNext());

        return head;
    }
}

