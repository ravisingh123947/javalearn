package com.springbootdemo.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("link1");
        queue.add("link2");
        queue.add("link3");
        System.out.println(queue);

        queue.remove();

        System.out.println(queue);
    }
}
