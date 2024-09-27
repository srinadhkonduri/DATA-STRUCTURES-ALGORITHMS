package com.SinglyLinkedList;

public class SinglyLinkedList {
    //    initialize head and tail with null and define the size of LL
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
//        initializing the head
        head = new Node();
//        creating instance of node
        Node node = new Node();
//        assigning node.next to null
        node.next = null;
//        assigning node.value = node value
        node.value = nodeValue;
//        assign head = node and tail = node and return the current size 1
        head = node;
        tail = node;
        size = 1;
//        finally return head
        return head;
    }

    //    creating a method to insert elements in the linked list
//    in the beginning middle and end
//    tc = O(n) sc = O(1)
    public void insertLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
//            this method is to insert the element in the beginning
//            of the linked list
        } else if (location == 0) {
            node.next = head;
            head = node;
//            this method is to insert the element in the last of the LL
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
//            this method is used to insert the values in the middle of the LL
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    //    creating method to traversal the linked list
    public void traversalSinglyLinkedList(){
        if (head == null){
            System.out.println("linked list does not exist");
        } else {
//            create a temp variable assign it to head
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    //    searching for a node in the current linked list
//    tc = O(N) sc = O(1)
    public boolean search(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.println("nodeValue " + nodeValue + " found at the index of " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("node value not found");
        return false;
    }

    //    creating a method to delete the elements in the sll
//    tc = O(N) sc = O(1)
    public void deleteSingleLinkedList(int location){
        if (head == null){
            System.out.println("linked list does not exist");
            return;
//            element in the beginning of the ll
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
//            element in the end of the ll
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
//            element in the middle of the ll
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    //    creating a method to deleting the entire single linked list
//    tc = O(1) sc = O(1)
    public void deleteSll(){
        head = null;
        tail = null;
        System.out.println("sll deleted successfully");
    }
}
