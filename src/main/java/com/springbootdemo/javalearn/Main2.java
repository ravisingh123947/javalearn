package com.springbootdemo.javalearn;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(15);
//        list.add(25);
//        list.add(12);
//        list.add(28);
//
//        list.stream().filter(number -> number>20).forEach(number -> System.out.println(number));
//        takeElementAndReturnArray(2,3,4,5);
//    }
//
//    public static void takeElementAndReturnArray(int ...arr) {
//        for(int i : arr) {
//            System.out.println(i);
//        }
//    };

       try {
           if(1 == 1) {
               if(2 == 3){
                   System.out.println("hello");
               } else {
                   System.out.println("hii");
                   if(2/0 == 0) {
                       System.out.println("program will break");
                   }
               }
           }
       } catch (Exception e) {
           System.out.println("Inside catch block");
           e.printStackTrace();
       }
        System.out.println("program is outside of try-catch block");
    }
}
