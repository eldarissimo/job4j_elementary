package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean answer = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                answer = false;
                break;
            }
        }
        if (number <= 1) {
            answer = false;
        }
        return answer;
    }
}