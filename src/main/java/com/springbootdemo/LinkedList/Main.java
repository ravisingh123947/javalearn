package com.springbootdemo.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListService linkedListService = new LinkedListService();
        Node node = new Node();
        node.setData(1);
        linkedListService.addNode(node);
        linkedListService.printAllNode();

        System.out.println("***********");

        Node node1 = new Node();
        node1.setData(2);
        linkedListService.addNode(node1);
        linkedListService.printAllNode();

        System.out.println("***********");

        Node node2 = new Node();
        node2.setData(3);
        linkedListService.addNode(node2);
        linkedListService.printAllNode();

//        System.out.println("****************");
//        linkedListService.deleteNode(3);
//        linkedListService.printAllNode();

        System.out.println("reversed linked list");
        linkedListService.reverseLinkedList();
        linkedListService.printAllNode();
    }
}
