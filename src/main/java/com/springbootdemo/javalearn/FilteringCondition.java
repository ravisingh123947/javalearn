package com.springbootdemo.javalearn;

@FunctionalInterface
public interface FilteringCondition {
    abstract boolean test(Hotel hotel);
}
