package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax100To200Then200() {
        int left = 100;
        int right = 200;
        int result = Max.max(left, right);
        int expected = 200;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax100To100Then100() {
        int left = 100;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

}