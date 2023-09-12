package com.springbootdemo.starpattern;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberOfSpaceToTake = n -1;

        for(int i=1;i<=n;i++){
            int numberofStarToPrint = 2*i - 1;
            for(int j=0;j<numberOfSpaceToTake;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<numberofStarToPrint;j++) {
                System.out.print("*");
            }
            numberOfSpaceToTake--;
            System.out.println();
        }
    }
}
