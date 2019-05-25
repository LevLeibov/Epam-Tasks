package com.java.tasks;

public class Task_1_1 {
    public static void main(String[] args) {
        String a = "javacore";
        System.out.println(onesymbol(a));

    }
    static boolean onesymbol(String s){
        char[] s_arr = s.toCharArray();
        int len = s.length();
        for(char i: s_arr){
            int cropped = s.replaceAll(Character.toString(i), "").length();
            if(len - 1 != cropped){
                return false;
            }
        }
        return true;
    }
}
