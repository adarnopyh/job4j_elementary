package ru.job4j.condition;

public class Max {
    public Max(int one, int two) {
    }

    public Max(int one, int two, int three) {
    }

    public Max(int one, int two, int three, int four) {
    }

    public int max(int one, int two) {
        return one > two ? one : two;
    }

    public int max(int one, int two, int three) {
        return max(
                three,
                max(one, two)
        );
    }

    public int max(int one, int two, int three, int four) {
        return max(
                four,
                max(
                    three,
                    max(one, two)
        ));
    }
}