package com.springbootdemo.tryCatch;

public class TestFinallyBlock {
    public static void main(String[] args) {
        int x = callMethod();
        System.out.println("value returned from the callMethod: " + x);
    }

    public static int callMethod() {
        try {
            System.out.println("444");
            return 4;
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally block executed");
        }
        System.out.println("*********");
        return 10;
    }
}
