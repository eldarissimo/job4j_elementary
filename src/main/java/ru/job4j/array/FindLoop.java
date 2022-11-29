package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == element) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 13, 56, 31, 5, 10, 12, 2};
        int el = 31;
        int start = 1;
        int finish = 6;
        System.out.println(indexInRange(data, el, start, finish));
    }
}
