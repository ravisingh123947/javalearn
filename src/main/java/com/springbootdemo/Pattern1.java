package com.springbootdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z]{3}");
        String str = "ravIranJankUmar";
        Matcher match = pattern.matcher(str);

        while (match.find()) {
            String s = match.group();
            System.out.println("group :" + s);
            str = str.replace(s,"***");
            System.out.println("String after manupulate: " + str);
        }
        System.out.println(str);
    }
}
