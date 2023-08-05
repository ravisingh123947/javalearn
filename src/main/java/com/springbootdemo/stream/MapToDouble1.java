package com.springbootdemo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapToDouble1 {
    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);

        System.out.println("using lambda function");
        listOfInteger.stream().map(a -> a * 2).mapToDouble(a -> a*2).forEach(a -> System.out.println(a));
        System.out.println("using method reference");
        listOfInteger.stream().map(a -> a * 2).mapToDouble(SupposeAlreadyDefinedFunction :: doubleTheNumber).forEach(a -> System.out.println(a));
    }
}
