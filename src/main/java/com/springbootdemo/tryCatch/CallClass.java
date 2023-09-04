package com.springbootdemo.tryCatch;

import com.mongodb.assertions.Assertions;
import com.springbootdemo.stream.Student;
import org.springframework.util.Assert;

public class CallClass {
    public void callMe() {
        Student student = new Student();
        student = null;
        try {
            System.out.println(student.getName());
        } catch (Exception e) {
            throw new NullPointerException();
        }
        System.out.println("this line is important is callMe method");
    }
}
