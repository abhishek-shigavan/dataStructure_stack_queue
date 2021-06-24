package com.abhi.stack;

public class MyQueue<E> {

    //defining head & tail
    public INode<E> head;
    public INode<E> tail;

    public MyQueue() {

        this.head = null;
        this.tail = null;
    }
/**
 * This method makes first new node as head &
 * second new node as tail & store tail as next node of head
 * For afterwards node it will make new node as next node of
 * tail & make new node as new tail
 *
 * @return No return
 */
    public void enqueue(INode<E> newNode){

        if(this.head == null){

            this.head = newNode;
        }
        else if(this.tail == null){

            head.setNext(newNode);
            this.tail = newNode;
        }
        else{
            INode tempNode = this.tail;
            tempNode.setNext(newNode);
            this.tail = newNode;
        }
    }
}
