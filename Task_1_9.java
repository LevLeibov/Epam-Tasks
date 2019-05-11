package com.java.tasks;

public class Task_1_9 {
    public static void main(String[] args) {
        String x = "abcde";
        String y = "deabc";

        System.out.println(isSubstring(x ,y));

    }
    static boolean isSubstring(String origin, String shift){
        int len = origin.length();
        if(len != shift.length()){
            return false;
        }
        for(int i = 0, j = len - 1; i < len  && j > 0 ; i++, j--){
            boolean condition1 = shift.substring(j+1).equals(origin.substring(0, i));
            boolean condition2 = shift.substring(0, j+1).equals(origin.substring(i));
            if(condition1 && condition2){
                return true;
            }
        }
        return false;

    }
}
