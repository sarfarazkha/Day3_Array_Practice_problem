package com.bl;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        //for (int i=2; i<num;i++){
//            if (num%i==0 && num!=i){
//                System.out.println("is not prime number= " + num);
//            break;
//            }
//            if(i==10){
//                System.out.println("is a prime num = " + num);
//            }
           // for (int j=1; j<num;j++){
                if(num%2==0 ){
                    System.out.println("number is even = " + num);
                }
                else {
                    System.out.println("number is odd = " + num);
                }
                



        }
    }
