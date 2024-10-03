package com.stacksusingLinkedList;

public class stack {
    LinkedList linkedlist;
    public stack(){
        linkedlist = new LinkedList();
    }

//    creating a push method to insert elements into the stack
    public void push(int value){
        linkedlist.insertLinkedList(value, 0);
        System.out.println("Inserted " + value + " in stack");
    }

//    creating is empty method
    public boolean isEmpty(){
        if (linkedlist.head == null){
            return true;
        } else {
            return false;
        }
    }

//    creating a method for pop method in stack
    public int pop(){
        int result = -1;
        if(isEmpty()){
            System.out.println("the stack is empty");
        } else {
            result = linkedlist.head.value;
            linkedlist.deleteSingleLinkedList(0);
        }
        return result;
    }

//    creating a method for peek in the stack
    public int peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        } else {
            return linkedlist.head.value;
        }
    }


//    creating a method to delete the stack
    public void deletestack(){
        linkedlist.head = null;
        System.out.println("the stack is deleted successfully");
    }
}
