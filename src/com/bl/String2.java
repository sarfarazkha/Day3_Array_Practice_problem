package com.bl;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        String Sentence = "thre is my name";
        String[] replace = Sentence.split(",");
        for (String a : replace) {
            System.out.println(Arrays.toString(replace));
            break;

        }
        replace[replace.length] = "our";
        for (String a : replace) {
            System.out.println(replace);
        }
    }
}
