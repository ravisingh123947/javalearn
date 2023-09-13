package com.springbootdemo.Tree;

public class Transverse {

    public void inorderTraversal(Node root) {

            if(root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);

    }
}
