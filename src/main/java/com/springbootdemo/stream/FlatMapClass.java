package com.springbootdemo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapClass {
    public static void main(String[] args) {
        List<EmployeePhoneNumberDetail> employeePhoneNumberDetails = new ArrayList<>();
        employeePhoneNumberDetails.add(new EmployeePhoneNumberDetail(1,List.of("12345","123456","145")));
        employeePhoneNumberDetails.add(new EmployeePhoneNumberDetail(2,List.of("678","6789","145")));

        System.out.println("list of employee with id and phoneNumber");
        employeePhoneNumberDetails.stream().forEach(a -> System.out.println(a.toString()));
        System.out.println("list of only phone number for each employee");
        employeePhoneNumberDetails.stream().map(a -> a.getPhoneNumber()).forEach(a -> System.out.println(a));
        System.out.println("phone number starts with 1");
        Stream<String> listOfPhoneNumber = employeePhoneNumberDetails.stream().map(a -> a.getPhoneNumber()).flatMap(a -> a.stream().map(b -> "+91 " + b));

        listOfPhoneNumber.forEach(a -> System.out.println(a));

        Stream<String> distinctPhoneNumber = employeePhoneNumberDetails.stream().map(a -> a.getPhoneNumber()).flatMap(a -> a.stream().map(b -> "+91 " + b)).distinct();

        System.out.println("list of distinct phone number");
        distinctPhoneNumber.forEach(a -> System.out.println(a));
    }
}
