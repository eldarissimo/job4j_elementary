package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax33To34Then34() {
        int first = 33;
        int second = 34;
        int result = Max.max(first, second);
        int expected = 34;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2To10Then10() {
        int first = 3;
        int second = 2;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax35To12To1To99Then99() {
        int first = 35;
        int second = 12;
        int third = 1;
        int fourth = 99;
        int result = Max.max(first, second, third, fourth);
        int expected = 99;
        assertThat(result).isEqualTo(expected);
    }

}