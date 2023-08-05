package com.springbootdemo.MapLearn;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ravi");
        map.put(2,"gautam");
        map.put(3,"shubham");

        for(Map.Entry<Integer,String> mm : map.entrySet()) {
            System.out.println(mm.getKey() + ":" + mm.getValue() );
        }

    }
}
