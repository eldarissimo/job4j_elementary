package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToDollar(float value) {
        return value * 1.16f;
    }

    public static float dollarToEuro(float value) {
        return value * 0.85f;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        in = 120;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result: " + passed);
        in = 100;
        expected = 116;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("100 euro are 116. Test result: " + passed);
        expected = 85;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("100 euro are 85. Test result: " + passed);
    }

}