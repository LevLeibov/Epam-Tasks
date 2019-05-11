package com.java.tasks;

import java.util.ArrayList;
import java.util.Random;

public class task_1_8 {
    public static void main(String[] args) {
        matrix(5, 5);

    }
    static int[][] matrix(int rows, int cols){
        int[][] mat = new int[rows][cols];
        ArrayList<Integer> row_arr = new ArrayList<>();
        ArrayList<Integer> col_arr = new ArrayList<>();

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                Random rand = new Random();
                mat[r][c] = rand.nextInt(50);
                if(mat[r][c] == 0){
                    row_arr.add(r);
                    col_arr.add(c);
                }
            }

        }
        int size = row_arr.size();
        for(int x = 0, y = 0; x < size && y < size; x++, y++){
            for(int c = 0; c < cols; c++){
                mat[row_arr.get(x)][c] = 0;
            }
            for(int r = 0; r < rows; r++){
                mat[r][col_arr.get(y)] = 0;
            }

        }
        return mat;

    }
}
