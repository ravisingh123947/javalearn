package com.springbootdemo.stringTesting;

import com.springbootdemo.javalearn.Student;

public class TestObject {
    public static void main(String[] args) {
        Object obj = null;
        Student student = new Student(1,"raviranjan");
        obj = student;
        System.out.println(obj.toString());
    }
}
