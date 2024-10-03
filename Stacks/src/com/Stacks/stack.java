package com.Stacks;
// creating stacks using arrays
public class stack {
    int[] arr;
    int topOfStack;

    public stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("the created size of the stack is " + size);
    }

//    creating a method that if the stack is empty or not
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

//    creating isFull method
    public boolean isFull(){
        if (topOfStack == arr.length-1){
            return true;
        } else {
            return false;
        }
    }

//    creating a method for pushing the element into the stack
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("the value is successfully inserted");
        }
    }

//    creating a method for popping the element from the stack
    public int pop(){
        if (isEmpty()){
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topOfStack;
        }
    }

//    creating a method for peeking the element in the stack
    public int peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

//    creating a method to deleting the stack from the array
    public void deleteStack(){
        arr = null;
        System.out.println("the stack is successfully deleted");
    }
}
