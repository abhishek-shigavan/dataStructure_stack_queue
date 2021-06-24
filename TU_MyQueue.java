package com.abhi.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MyQueue {
    //for enqueue
    @Test
    void whenEnqueueFirstNodeShouldBeHead() {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);

        boolean result = myQueue.head.equals(myFirstNode) && myQueue.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
    //for dequeue
    @Test
    void whenDequeueNodeNextToHeadShouldBeHead() {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.dequeue();
        boolean result = myQueue.head.equals(mySecondNode) && myQueue.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}
