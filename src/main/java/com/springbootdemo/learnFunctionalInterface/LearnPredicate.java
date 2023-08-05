package com.springbootdemo.learnFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnPredicate {
    public static <List> void main(String[] args) {
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 10;
//            }
//        };
//
//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };

        Predicate<Integer> predicate = a -> a > 10;
        Consumer<Integer> consumer = a -> System.out.println(a);

        java.util.List<Integer> list = Arrays.asList(1,2,3,4,5,6,11,12);
        list.stream().filter(predicate).forEach(consumer);

        System.out.println("*****************");

        java.util.List<Integer> filteredList = null;

        filteredList = list.stream().filter(predicate).collect(Collectors.toList());

        for(var element : filteredList) {
            System.out.println(element);
        }

    }
}
