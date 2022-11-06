package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(2, 2, 2);
        System.out.println(result);
        result = Triangle.exist(10, 10, 20.5);
        System.out.println(result);
    }
}