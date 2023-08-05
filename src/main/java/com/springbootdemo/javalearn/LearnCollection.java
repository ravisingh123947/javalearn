package com.springbootdemo.javalearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class LearnCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ravi");
        Collection<String> copyOfList = list;
        copyOfList.add("gautam");
    }
}
