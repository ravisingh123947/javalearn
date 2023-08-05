package com.springbootdemo.javalearn1;

public class SumImpl implements InterfaceForSumImpl{
    @Override
    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    @Override
    public int sumThreeNumber(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public int sumFourthNumber(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public void doCalculation() {
        System.out.println("i am calculating ");
    }
}
