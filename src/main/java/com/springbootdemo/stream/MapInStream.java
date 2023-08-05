package com.springbootdemo.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapInStream {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ravi",1000);
        map.put("golu",2000);
        map.put("rj",3000);

       map.entrySet().stream().filter(entry -> entry.getValue() > 1500).map(Map.Entry :: getKey);

    }
}
