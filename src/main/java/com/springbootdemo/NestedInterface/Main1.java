package com.springbootdemo.NestedInterface;

public class Main1 {
    public static void main(String[] args) {
        Vehicle.Engine car = new Car();
        car.accelerate();
        car.stop();
    }
}
