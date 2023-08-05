package com.springbootdemo.learnSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {

        // in TreeSet element will be in the sorted order
        Set<String> hashSet = new TreeSet<>();
        hashSet.add("ravi");
        hashSet.add("gautam");
        hashSet.add("subham");
        hashSet.add("arya");

        hashSet.stream().forEach(a -> System.out.println(a));
    }
}
