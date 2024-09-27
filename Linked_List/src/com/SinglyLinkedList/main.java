package com.SinglyLinkedList;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(1);
        sll.insertLinkedList(2,1);
        sll.insertLinkedList(3,2);
        sll.insertLinkedList(4,3);
        sll.insertLinkedList(5,4);
        sll.traversalSinglyLinkedList();
        sll.search(3);
        sll.deleteSll();
        sll.traversalSinglyLinkedList();
    }
}
