package com.springbootdemo.Tree;

import org.springframework.data.mongodb.core.query.Query;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CreateCompleteBinaryTree {
    public Node createTree(List<Integer> list) {
        Node root = new Node(list.get(0));

        if(list == null || list.size() ==0) {
            return null;
        }
        int index = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(index < list.size()) {
            Node currentNode = queue.poll();

            if(index < list.size()) {
                currentNode.left = new Node(list.get(index));
                queue.offer(currentNode.left);
                index++;
            }
            if(index < list.size()) {
                currentNode.right = new Node(list.get(index));
                queue.offer(currentNode.right);
                index++;
            }
        }

        return root;
    }

}
