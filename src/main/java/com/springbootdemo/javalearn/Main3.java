package com.springbootdemo.javalearn;

public class Main3 {
    public static void main(String[] args) {
//        DaysOfWeek day = DaysOfWeek.MONDAY;
//        if(day == DaysOfWeek.MONDAY) {
//            System.out.println("yes, it is monday");
//        }

//        for(DaysOfWeek day : DaysOfWeek.values()) {
//            System.out.print(day);
//            System.out.println("  :" + day.hoursOfStudy);
//        }

        String day = "Mon_*dAy";
        System.out.println(day.equalsIgnoreCase(DaysOfWeek.MONDAY.value()));
    }
}
