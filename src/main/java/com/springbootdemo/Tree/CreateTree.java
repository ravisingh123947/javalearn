package com.springbootdemo.Tree;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CreateTree {
    public Node createTree(List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return null;
        }

        Node root = new Node(nums.get(0));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;

        while (index < nums.size()) {
            Node current = queue.poll();

            // Create the left child
            if (index < nums.size()) {
                current.left = new Node(nums.get(index));
                queue.offer(current.left);
                index++;
            }

            // Create the right child
            if (index < nums.size()) {
                current.right = new Node(nums.get(index));
                queue.offer(current.right);
                index++;
            }
        }

        return root;
    }
}
