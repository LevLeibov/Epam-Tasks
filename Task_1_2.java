package com.java.tasks;

import java.util.Arrays;

public class Task_1_2 {
    public static void main(String[] args) {
        String x = "javacore";
        String y = "eavajroc";
        System.out.println(lineswap(x, y));

    }
    static boolean lineswap(String a, String b){
        int len_a = a.length();
        int len_b = b.length();
        if(len_a != len_b){
            return false;
        }
        char[] a_arr = a.toCharArray();
        Arrays.sort(a_arr);
        char[] b_arr = b.toCharArray();
        Arrays.sort(b_arr);
        return Arrays.equals(a_arr, b_arr);
    }
}