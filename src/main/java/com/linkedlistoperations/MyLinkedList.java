/* Purpose: to delete node at specific position and verify new size of linked list */
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
        return tempNode == searchnode;
    }

    public <E> INode index(E searchKey) {
        INode tempNode = this.head;
        while (tempNode.getKey() != searchKey) {
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    public INode remove(INode searchNode) {
        INode firstNode = this.head;            // store current head in firstNode
        INode temp1Node = this.head;
        while (temp1Node != searchNode) {       //traverse list till temp1Node is equal to searchNode
            temp1Node = temp1Node.getNext();
        }
        this.head = temp1Node;                  //reset head to node to be deleted
        pop();
        INode endNode = this.head;              //store head node after popping , to be later joined at the end
        this.head = firstNode;                  //reset head to firstNode
        INode temp2Node = this.head;            //traverse list till node before the deleted node
        while (temp2Node.getNext() != searchNode) {
            temp2Node = temp2Node.getNext();
        }
        temp2Node.setNext(endNode);             //break earlier link and join front sublist to endNode
        return this.head;
    }

    public int size() {                         //calculates size of linked list
        int size = 0;
        if (this.head == null)
            return size;
        else
            size = 1;
        INode tempNode = this.head;
        while (tempNode.getNext() != null ) {
            tempNode = tempNode.getNext();
            size++;
        }
        return size;
    }
}
