package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {11, 1, 3, 4, 8, 24, 34, 20, 56, 1, 23, 3};
        System.out.println(Arrays.toString(sort(data)));
    }
}