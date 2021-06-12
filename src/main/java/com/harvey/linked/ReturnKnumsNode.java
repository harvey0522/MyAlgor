package com.harvey.linked;

/**
 * 缺乏数学思维导致不懂里面的套路
 */
public class ReturnKnumsNode {
    public static void main(String[] args) {
        MyLinkedNode node = MyLinkedNode.build2();
        MyLinkedNode reverse=reverse(node,6);
        //MyLinkedNode reverse=reverseByRecursion(node);

        while (reverse!=null) {
            System.out.println(reverse.getVal());
            reverse=reverse.getNext();
        }

    }

    public static  MyLinkedNode reverse(MyLinkedNode head,int k){
        MyLinkedNode fast=head,slow=head;
        for(int i=0;i<k;i++){
            if(fast==null)
                break;
            fast=fast.getNext();
        }
        while (fast!=null){
            fast=fast.getNext();
            slow=slow.getNext();
        }
        return slow;
    }
}

