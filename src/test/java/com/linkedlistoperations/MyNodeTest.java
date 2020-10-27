/* Purpose: to create nodes of a linked list and link them */
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
}

