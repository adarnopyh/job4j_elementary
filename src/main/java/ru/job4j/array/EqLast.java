package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int i = 0; i < right.length; i++) {
            return right[right.length - 1] == left[left.length - 1];
        }
        return result;
    }
}