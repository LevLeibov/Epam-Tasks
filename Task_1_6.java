package com.java.tasks;

public class Task_1_6 {
    public static void main(String[] args) {
        String x = "jjjjavaaa";
        System.out.println(crop(x));

    }
    static String crop(String a){
        int len_a = a.length();
        char[] a_arr = a.toCharArray();
        //Arrays.sort(a_arr);
        int k = 1;
        boolean j = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < len_a; i++){
            if(a_arr[i-1] == a_arr[i]) {
                k++;
                j = true;
                if(i == len_a - 1) {
                    sb.append(a_arr[i]);
                    sb.append(k);
                }
            }else{
                sb.append(a_arr[i-1]);
                sb.append(k);
                k = 1;
            }
        }
        if(j) {
            return sb.toString();
        }return a;

    }
}
