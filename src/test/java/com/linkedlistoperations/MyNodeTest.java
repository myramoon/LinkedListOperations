/* Purpose: to create nodes of a linked list and add them to top of list */
package com.linkedlistoperations;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest<T> {
    @Test
    public void given3Numbers_WhenLinked_ShouldPassLinkedListTest() {

        //initialising each node with a key
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        //setting next node for each node using setter method
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        //checking if next nodes are set as expected
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop() {
        //initialise node objects
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        //create a linked list
        MyLinkedList myLinkedList = new MyLinkedList();
        //add nodes to the linked list
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}

