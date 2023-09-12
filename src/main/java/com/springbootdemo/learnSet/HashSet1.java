package com.springbootdemo.learnSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {

        // In Hashset there is no order of insertion means there is no gurantee
        Set<String> hashSet = new HashSet<>();
        hashSet.add("ravi");
        hashSet.add("gautam");
        hashSet.add("subham");
        hashSet.add("arya");
        hashSet.add("gautam");

        hashSet.stream().forEach(a -> System.out.println(a));
    }
}
