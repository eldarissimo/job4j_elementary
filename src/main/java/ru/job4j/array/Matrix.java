package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = (i + 1) * (j + 1);
            }
        }
        return board;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Matrix.multiple(4)));
    }
}
