package com.springbootdemo;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,5,6,7));
        printTwoSum(list,10);
    }

    public static void printTwoSum(List<Integer> list,int n) {
        int start = 0;
        int end = list.size() -1;

        while(start < end) {
            if(list.get(start) + list.get(end) > n) {
                start ++;
            } else if (list.get(start) + list.get(end) < n) {
                end--;
            }else{
                System.out.println(list.get(start) + " " + list.get(end));
                start++;
                end--;
            }
        }
    }
}
