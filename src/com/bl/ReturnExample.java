package com.bl;

public class ReturnExample {
    int   display(){
      return 10;
    }

    public static void main(String[] args) {
        ReturnExample re = new ReturnExample();
        System.out.println(re.display());
    }
}
