package com.springbootdemo.LinkedList;

public class LinkedListService {

    Node head = null;
    public void addNode(Node node) {
        if(head == null) {
            head = node;
        }else {
            Node temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node temp1 = new Node();
            temp1.setData(node.getData());
            temp.setNext(temp1);
        }
    }

    public void printAllNode() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void deleteNode(int nodeToBeDeleted) {
        if(nodeToBeDeleted == head.getData()) {
            head = head.getNext();
        }else{
            Node previousNodeToBeDelted = head;
            Node temp = head.getNext();
            while(temp.getData() != nodeToBeDeleted) {
                previousNodeToBeDelted = temp;
                temp = temp.getNext();
            }
            previousNodeToBeDelted.setNext(temp.getNext());
        }
    }

    public void reverseLinkedList() {
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

}
