package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {20, 15, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 15, 20};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort12() {
        int[] data = new int[] {11, 1, 3, 4, 8, 24, 34, 20, 56, 1, 23, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 3, 3, 4, 8, 11, 20, 23, 24, 34, 56};
        assertThat(result).containsExactly(expected);
    }
}