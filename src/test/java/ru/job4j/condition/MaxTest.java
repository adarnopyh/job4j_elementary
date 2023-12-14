package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        Max maximus = new Max(one, two);
        int result = maximus.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2ThenAny() {
        int one = 2;
        int two = 2;
        Max maximus = new Max(one, two);
        int result = maximus.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To5Then5() {
        int one = 2;
        int two = 3;
        int three = 5;
        Max maximus = new Max(one, two, three);
        int result = maximus.max(one, two, three);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To5To7Then7() {
        int one = 2;
        int two = 3;
        int three = 5;
        int four = 7;
        Max maximus = new Max(one, two, three, four);
        int result = maximus.max(one, two, three, four);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
