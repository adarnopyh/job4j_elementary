package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < array.length) {
            if (array[i] + array[j] > target) {
                j--;
            }
            if (array[i] + array[j] == target && i != j) {
                return new int[]{i, j};
            }
            i++;
        }
        return new int[0];
    }
}
