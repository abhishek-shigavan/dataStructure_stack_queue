package com.abhi.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MyStack {
    //for stack add operation
    @Test
    void whenElementAddedToStackLastElementShouldTop() {

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        boolean result = myStack.head.equals(myFirstNode) && myStack.head.getNext().equals(mySecondNode)
                && myStack.tail.equals(myThirdNode);

        Assertions.assertTrue(result);
    }
    //for peak
    @Test
    void whenPeakIsCalledShouldReturnTailElement() {

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.getPeak();

        boolean result = peak.equals(myThirdNode);
    }
    //pop till stack is empty
    @Test
    void whenPopTillStackEmptyReturnNodeShouldBeFirstNode() {

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        boolean isEmpty = myStack.popTillEmpty();

        System.out.println(isEmpty);
        boolean result = myStack.head == null && myStack.tail == null;
    }
}
