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
}
