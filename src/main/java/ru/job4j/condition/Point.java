package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((int) Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(3, 5, 2, 7);
        System.out.println("result2 (3, 5) to (2, 7) " + result2);
        double result3 = Point.distance(23, 15, 2, 107);
        System.out.println("result3 (23, 15) to (2, 107) " + result3);
    }
}
