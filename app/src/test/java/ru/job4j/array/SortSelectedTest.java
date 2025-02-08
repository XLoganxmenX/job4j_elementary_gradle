package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void sortWith3Numbers() {
        int[] data = new int[] {99, 1, 45};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 45, 99};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void sortWith5Numbers() {
        int[] data = new int[] {12, 0, 19, 59, 13};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 12, 13, 19, 59};
        assertThat(result).containsExactly(expected);
    }
}