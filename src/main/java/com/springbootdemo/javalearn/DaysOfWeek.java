package com.springbootdemo.javalearn;

public enum DaysOfWeek {
    SUNDAY("Sunday"),
    MONDAY("Mon_*day");

    private String value ;

    DaysOfWeek(String labelKey) {
        this.value = labelKey;
    }

    public String value() {
        return value;
    }
}
