package com.springbootdemo.javalearn;

import java.util.Calendar;
import java.util.Locale;

public class Main5 {
    public static void main(String[] args) {
        long num = 1233452535;
        String modifiedString = String.format(Locale.GERMAN,"number is: %,d",num);
        System.out.println(modifiedString);
    }
}
