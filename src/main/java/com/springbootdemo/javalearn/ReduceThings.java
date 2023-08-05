package com.springbootdemo.javalearn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceThings {
    public static void main(String[] args) {


        //**************get sum of array
//        Optional<Integer> result = numbers.stream().reduce((a, b) -> {
//            System.out.println("a= " + a + ", b= " +b);
//            return a+b;
//        });

        //***********sum of even number number ingoring first number
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        Optional<Integer> result = numbers.stream().reduce((sum, b) -> {
//            System.out.println("sum= " + sum + ", b= " +b);
//            return sum + (b%2 == 0 ? b : 0);
//        });

//        if(result.isPresent()){
//            System.out.println("yes, value is there with value: " + result.get());
//        } else {
//            System.out.println("result is null");
//        }

        //*********alternative(best option) to find sum of even number

//        Integer result = numbers.stream().reduce(0,(a, b) -> {
//            System.out.println("a= " + a + ", b= " +b);
//            if(b%2 == 0) {
//                  a = a + b;
//            }
//            return a;
//        });
//        System.out.println(result);


        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> result = numbers.stream().reduce((sum, b) -> {
            System.out.println("sum= " + sum + ", b= " +b);
            return sum + b;
        });


    }
}
