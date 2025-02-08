package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float in2 = 180;
        float expectedEuro = 2;
        double expectedDollar = 3;
        float outEuro = Converter.rubleToEuro(in1);
        float outDollar = Converter.rubleToDollar(in2);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
        System.out.println("180 rubles are 3 Dollars. Test result : " + passedDollar);
    }
}
