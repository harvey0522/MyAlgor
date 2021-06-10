package com.harvey.linked;

public class HasCycleLinked {
    public static void main(String[] args) {
        MyLinkedNode node = MyLinkedNode.build();
        System.out.println(hasCycle(node).getVal());
    }

    public static MyLinkedNode hasCycle(MyLinkedNode node){
        MyLinkedNode slow=node;
        MyLinkedNode fast=node;
        while(fast!=null){

            slow=slow.getNext();
            fast=fast.getNext().getNext();

            if(slow==fast){
                System.out.println("fast..."+fast.getVal());
                MyLinkedNode ptr=node;
                while(ptr!=slow){
                    ptr=ptr.getNext();
                    slow=slow.getNext();
                }
                return ptr;
            }
        }
        return null;
    }
}
