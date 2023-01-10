package com.bl;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        int[] Hobbies = {1, 2, 3, 4};
        for (int i = 0; i < Hobbies.length; i++) {
            System.out.println(i);

        }
        Hobbies[1] = 4;
        for (int i = 0; i < Hobbies.length; i++) {
            System.out.println(Arrays.toString(Hobbies));
        }
    }
}

