package com.linkedlistoperations;

public class MyLinkedList {

    public INode tail;
    public INode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            INode tempNode = this.head; //already present node to which head pointed is now in tempNode
            this.head = newNode;        //make head point to the new node
            this.head.setNext(tempNode); // node next to node being pointed by head is set to the old node (already present)
        }

    }
}
