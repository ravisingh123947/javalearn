package com.springbootdemo.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        CreateTree createTree = new CreateTree();
        Node head = createTree.createTree(list);

        Transverse transverse = new Transverse();
        transverse.inorderTraversal(head);

        System.out.println(head.toString());
    }
}
