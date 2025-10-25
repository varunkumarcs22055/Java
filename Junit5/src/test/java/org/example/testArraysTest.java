package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class testArraysTest {
    @Test
    void Arrays()

    {
        int[] expected = {2, 4, 6, 8};
        int[] actual = {4, 6, 8, 2};
        Arrays.sort(actual);
        assertArrayEquals(expected,actual);

    }
}