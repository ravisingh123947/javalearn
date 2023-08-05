package com.springbootdemo.javalearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main7 {
    public static void main(String[] args) {
          AgeValidator ageValidator = new AgeValidator();

        try {
            if(ageValidator.ageValidator(16)) {
                System.out.println("you are eligible as you are above 18 years");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
