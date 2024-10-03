package com.Stacks;

public class main {
    public static void main(String[] args) {
        stack newStack = new stack(5);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        System.out.println(newStack.pop());
        int result = newStack.pop();
        System.out.println(result);
    }
}
