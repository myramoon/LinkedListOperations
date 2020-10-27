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
            INode tempNode = this.head;  //already present node to which head pointed is now in tempNode
            this.head = newNode;         //make head point to the new node
            this.head.setNext(tempNode); // node next to node being pointed by head is set to the old node (already present)
        }
    }

    public void append(INode newNode) {
        if(this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode myNode , INode newNode) {
        INode tempNode = myNode.getNext();  //store the latter node in tempNode
        myNode.setNext(newNode);            // make former node point to new node
        newNode.setNext(tempNode);          //make new node point to tempNode (containing latter node)
    }

    public INode pop() {
        INode tempNode = this.head;         //store head in tempNode
        this.head = head.getNext();         //set head to point to next node after head
        return tempNode;
    }

    public INode popLast(){
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();    //set tempNode to successive nodes
        }
        this.tail = tempNode;                //make tail store tempNode(which is storing last element before tail)
        tempNode = tempNode.getNext();       //make tempNode store tail
        return tempNode;
    }

    public boolean search(INode searchnode) {
        INode tempNode = this.head;
        while (tempNode != searchnode && tempNode.getNext() != this.tail){
            tempNode = tempNode.getNext();
        }
        if (tempNode == searchnode)
            return true;
        else
            return false;

    }
}
