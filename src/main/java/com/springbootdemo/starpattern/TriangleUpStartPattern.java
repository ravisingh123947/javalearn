package com.springbootdemo.starpattern;

public class TriangleUpStartPattern {
    public static void main(String[] args) {
        int n=9;
        for(int i=1;i<=9;i++) {
            if(i == 1) {
                for(int j=1;j<=n-i;j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }else{
                for(int j=1;j<=n-i;j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=1;j<2*i-1;j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
        for(int i=1;i<=2*n-1;i++) {
            System.out.print("*");
        }
    }
}
