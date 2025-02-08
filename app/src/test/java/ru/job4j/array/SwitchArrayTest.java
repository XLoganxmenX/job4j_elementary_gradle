package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to4() {
        int[] input = {99, 1230, 40, 4, 11, 6};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {99, 11, 40, 4, 1230, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap6to7() {
        int[] input = {99, 1230, 40, 4, 11, 6, 0, 700};
        int source = 6;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {99, 1230, 40, 4, 11, 6, 700, 0};
        assertThat(result).containsExactly(expected);
    }
}