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
/**
 * This method returns tail of the
 * LinkedList
 * Peak is top element of stact i.e
 * tail of LinkedList
 *
 * @return tail of Linked List
 *
 */
    public INode<E> getPeak(){

        return this.tail;
    }
/**
 * This method removes top element
 * of stack
 *
 * @return No return
 */
    public void pop(){

        //storing head into temp node
        INode tempNode = this.head;
 
       //loop will iterate till previous node of tail & gives previous node of tail
        while(!tempNode.getNext().equals(tail)){

            //replacing temp node with its next node
            tempNode = tempNode.getNext();
        }
        //making previous node of tail as new tail
        this.tail = tempNode;
    }
/**
 * This method will pop the element till
 * tail become as next node of head
 * Then make both head & tail as null
 * to make stack empty
 *
 * @return true -- if stack is empty
 *         false -- if stack is not empty
 */
    public boolean popTillEmpty() {

        //initializing flag as false
        boolean flag = false;

        //stroing head into temp node
        INode tempNode = this.head;

        //calling pop till tail become next node of head
        while(!tempNode.getNext().equals(tail)){

            pop();
        }

        //when there are only 2 element head & tail
        if(tempNode.getNext().equals(tail)){

            //making head & tail null as there are only two element i.e head & tail
            this.head = null;
            this.tail = null;
        }
     
        //checking the stack is empty / not
        if(this.head == null && this.tail == null){
     
            //setting flag as true
            flag = true;
        }
        return flag;
    } 
}
