/* Purpose: to create nodes of a linked list and link them */
package com.linkedlistoperations;

public class MyNode<E> {
    private E key;
    private MyNode next;

    public MyNode(E key) {
        this.key = key;
        this.next = null;
    }

    //getter and setter methods for next
    public MyNode getNext() {
        return next;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }
}
