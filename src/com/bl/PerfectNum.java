package com.bl;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
      int n, sum = 0;
      n = sc.nextInt();
      for (int i=1; i<n; i++){
          if (n% i==0){
              sum = sum+i;
          }
      }
      if (sum == n){
          System.out.println("perfect num");

      }
      else {
          System.out.println("not perfect num");
      }
    }
}