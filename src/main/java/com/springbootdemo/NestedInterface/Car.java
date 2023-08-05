package com.springbootdemo.NestedInterface;

public class Car implements Vehicle.Engine{
    @Override
    public void accelerate() {
        System.out.println("car is accellerating ");
    }

    @Override
    public void stop() {
        System.out.println("car stopped");
    }
}
