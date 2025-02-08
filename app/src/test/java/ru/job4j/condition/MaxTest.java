package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxAllThenAny() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1and2and3Then3() {
        int one = 1;
        int two = 2;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7and7and7Then7() {
        int one = 7;
        int two = 7;
        int three = 7;
        int result = Max.max(one, two, three);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1and2and3and4Then4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int result = Max.max(one, two, three, four);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5and5and5and5Then5() {
        int one = 5;
        int two = 5;
        int three = 5;
        int four = 5;
        int result = Max.max(one, two, three, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

}