package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int comparis = left > right ? left : right;
        return comparis;
    }

    public static void main(String[] args) {
        int msg = Max.max(100, 200);
        System.out.println(msg);
    }
}