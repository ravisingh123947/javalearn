package com.springbootdemo.javalearn;

public class AgeValidator {
    public boolean ageValidator(int age) throws CustomException {
        if (age>=18) {
            return true;
        } else {
            throw new CustomException("You are not eligible as u are below 18 year old!!");
        }
    }
}
