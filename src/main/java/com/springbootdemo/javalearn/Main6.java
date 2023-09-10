package com.springbootdemo.javalearn;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {

//           List<String> names = Arrays.asList("Raviranjan","Ravi", "Gautam", "Arya");
//           List<String> filteredName = names.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());
//
//           filteredName.stream().forEach(name -> System.out.println(name));
//
//        System.out.println("*******************");
//
//        filteredName.stream().map(name -> "Hey, " + name).forEach(name -> System.out.println(name));





//        Map<Integer,String > map = new HashMap<>();
//        map.put(1,"raviranjan");
//        map.put(2,"gautam");
//        map.put(1,"raviranjan");
//
//        Collection<String> name = map.values();
//        Set<Integer> id = map.keySet();
//
//        System.out.println("*****************");
//        for(int i : id) {
//            System.out.println(i);
//        }
//        System.out.println("*****************");
//        for(String n : name) {
//            System.out.println(n);
//        }
//        System.out.println("**************");
//        Set<Map.Entry<Integer,String>> entries = map.entrySet();
//
//        for(Map.Entry<Integer,String> entry : entries) {
//            System.out.println("key: " + entry.getKey() + ", " + "value: " + entry.getValue());
//        }
//        System.out.println("*************");
//        map.entrySet().stream().forEach(entry -> System.out.println("key: " + entry.getKey() + ", " + "value: " + entry.getValue()));



//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        Integer result = numbers.stream().reduce(5,(a,b) -> {
//            System.out.println(a + "   "  + b);
//            return a+b;
//        });
//        System.out.println(result);


//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        numbers.stream().forEach(ele -> System.out.println(ele));
//        System.out.println("****************");
//        numbers.stream().forEach(System.out::println);

//        Function<Integer,Double> makeHalf = number -> number/2.0;
//        makeHalf = makeHalf.andThen(number -> number*3);
//        System.out.println(makeHalf.apply(2));

    }
}
