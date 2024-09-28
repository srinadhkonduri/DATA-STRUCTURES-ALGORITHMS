package com.DoublyLinkedList;

public class main {
    public static void main(String[] args) {
        circularSinglyLinkedList csll = new circularSinglyLinkedList();
        csll.createCsll(1);
        System.out.println(csll.head.value);
    }
}
