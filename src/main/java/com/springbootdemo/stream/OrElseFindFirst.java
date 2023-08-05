package com.springbootdemo.stream;

import java.util.ArrayList;
import java.util.List;

public class OrElseFindFirst {
    public static void main(String[] args) {
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student(1,"ravi"));
        listOfStudent.add(new Student(2,"shubham"));
        listOfStudent.add(new Student(3,"rautam"));

        listOfStudent.stream().filter(student -> student.getName().startsWith("r")).forEach(student -> System.out.println(student.getName()));
        System.out.println("******************************");

        Student student1 = listOfStudent.stream().filter(student -> student.getName().startsWith("r")).findFirst().orElse(null);
        if(student1 == null) {
            System.out.println("no student name start with k");
        } else{
            System.out.println("student Id is: " + student1.getId() + "\n" + "student name is: " + student1.getName());
        }

//        List<String> listOfString = new ArrayList<>();
//        listOfString.add("raviranjan");
//        listOfString.add("gautam");
//        listOfString.add("gau");
//
//        String value = listOfString.stream().filter(name -> name.startsWith("k")).findFirst().orElse("default");
//        System.out.println(value);


    }
}
