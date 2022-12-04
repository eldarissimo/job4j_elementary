package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array.length - 1;
            int currentIndex = array.length - index - 1;
            result[index] = array[array.length - index - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(rollback(array)));
    }
}