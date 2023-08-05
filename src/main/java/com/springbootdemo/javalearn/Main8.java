package com.springbootdemo.javalearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main8 {
    public static void main(String[] args) throws IOException {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "ravi"));
        students.add(new Student(2, "gautam"));
        students.add(new Student(1, "arya"));
        students.add(new Student(2, "shubham"));

        Map<Integer, List<Student>> map = new HashMap<>();

        for (Student temp : students) {
            int key = temp.getId();
            if (map.containsKey(key)) {
                map.get(key).add(temp);
            } else {
                List<Student> students1 = new ArrayList<>();
                students1.add(temp);
                map.put(key, students1);
            }
        }

        for(Map.Entry<Integer,List<Student>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "-->>>");
            for(Student s : entry.getValue()) {
                System.out.println(s.getId() + " " + s.getName());
            }
        }
        System.out.println("*************************");

        Collections.sort(students);
        System.out.println("**************on the basis of id***********");
        for(Student student : students) {
            System.out.println(student.getId() + "  " + student.getName());
        }

        System.out.println("**************on the basis of id and name ***********");
        List<Student> finalList = new ArrayList<>();

        Student student1 = students.get(0);
        List<Student> temp = new ArrayList<>();
        temp.add(student1);
       for(int i=1; i<students.size(); i++) {
           if(students.get(i).getId() == student1.getId()) {
               temp.add(students.get(i));
           } else {
               student1 = students.get(i);
               Collections.sort(temp,new SortByName());
               finalList.addAll(temp);
               temp.removeAll(temp);
               temp.add(student1);
           }
       }
       Collections.sort(temp,new SortByName());
       finalList.addAll(temp);

        for(Student student : finalList) {
            System.out.println(student.getId() + "  " + student.getName());
        }

    }


}
