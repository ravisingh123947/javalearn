package com.springbootdemo.javalearn1;

public class Main1 {
    public static void main(String [] args) {
           InterfaceForSum interfaceForSum = new SumImpl();
           interfaceForSum.sumTwoNumber(2,3);

           InterfaceForSumImpl interfaceForSum1 = new SumImpl();
           interfaceForSum1.sumTwoNumber(1,2);
    }
}
