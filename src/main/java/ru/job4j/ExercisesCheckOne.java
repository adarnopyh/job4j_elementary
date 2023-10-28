package ru.job4j;

public class ExercisesCheckOne {
    public static void main(String[] args) {
        // 1 выражение
        long l = 129;
        byte b1 = (byte) l;
        System.out.println("1 выражение");
        System.out.println(l);
        System.out.println(b1);

        // 2 выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("2 выражение");
        System.out.println(i);
        System.out.println(rsl);

        // 3 выражение
        char c = 45000;
        float i2 = c;
        System.out.println("3 выражение");
        System.out.println(c);
        System.out.println(i2);

        // 4 выражение
        System.out.println("4 выражение");
        double d = 121.19;
        byte b = (byte) d;
        System.out.println(d);
        System.out.println(b);

        // 5 выражение
        short s = 1500;
        char c2 = (char) s;
        double d2 = c2;
        System.out.println("5 выражение");
        System.out.println(c2);
        System.out.println(d2);

    }
}
