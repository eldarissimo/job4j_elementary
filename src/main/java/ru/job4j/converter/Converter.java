package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }
    
    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return  rsl;
    }
    
    public static float euroToDollar(float value) {
        float rsl = value * 1.16f;
        return rsl;
    }
    
    public static float dollarToEuro(float value) {
        float rsl = value * 0.85f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        dollar = Converter.euroToDollar(20);
        System.out.println("15 euro are " + dollar + " dollars.");
        euro = Converter.dollarToEuro(15);
        System.out.println("20 dollars are " + euro + " euro.");
    }
}
