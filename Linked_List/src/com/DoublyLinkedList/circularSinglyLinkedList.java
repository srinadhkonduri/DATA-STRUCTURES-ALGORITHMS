package com.DoublyLinkedList;

public class circularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCsll(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
