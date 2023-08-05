package com.springbootdemo.learnSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
        public static void main(String[] args) {

            // in LinkedHashset there is order of insertion
            Set<String> hashSet = new LinkedHashSet<>();
            hashSet.add("ravi");
            hashSet.add("gautam");
            hashSet.add("subham");
            hashSet.add("arya");

            hashSet.stream().forEach(a -> System.out.println(a));
        }
}
