package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void test(){
        Reverse r = new Reverse();
        assertEquals("avaj",r.ReverseString("java"));
    }
}