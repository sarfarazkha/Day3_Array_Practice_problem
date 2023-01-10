package com.bl;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = num.nextInt();
        double result = 0.0;
        for (int i=number; i>0; i--){
            result = result + (double) 1/i;
            System.out.println(result );
        }
    }
}
