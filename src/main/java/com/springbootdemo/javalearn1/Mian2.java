package com.springbootdemo.javalearn1;

import java.io.IOException;

public class Mian2 {
    public static void main(String[] args) {

        IOException ioException = new IOException("this is http response");
        System.out.println(ioException.getMessage());
        System.out.println("done");
    }
}
