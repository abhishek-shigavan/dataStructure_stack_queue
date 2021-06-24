package com.abhi.stack;
/**
 * MyStack  --  Performing Stack Operations
 *
 * @return Abhishek Shigavan
 */
public class MyStack<E> {

    //defining head & tail
    public INode<E> head;
    public INode<E> tail;

    public MyStack() {

        this.head = null;
        this.tail = null;
    }
/**
 * This method make first node as head
 * & second node as tail
 * After that each new node will set as
 * next node of tail & set as new tail
 *
 * @param newNode
 * @return
 */
    public void push(INode<E> newNode){

        if(this.head == null){

            //setting new node as head
            this.head = newNode;
        }
        else if(this.tail == null){

            //making new node as next node of nead
            head.setNext(newNode);

            //setting new node as tail
            this.tail = newNode;
        }
        else {

            //storing tail into temp node
            INode<E> tempNode = this.tail;

            //setting new tail next to old tail
            tempNode.setNext(newNode);

            //setting new node as tail
            this.tail = newNode;
        }
    }  
}
