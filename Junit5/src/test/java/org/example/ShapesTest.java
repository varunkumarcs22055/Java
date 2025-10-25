package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTest {
    Shapes s = new Shapes();

    @Test
    void testCompute() {
        fail();
        assertEquals(576, s.computeSquareArea(24));
    }

    @Test
    void testComputeCircle() {

        assertEquals(78.5, s.computeCircleArea(5));
    }
    @Test
    void testComputeCircle_Supplier() {
        assertEquals(74.5, s.computeCircleArea(5), "This is failed how can you do this");
    }

    // Now assertNotEquals

    @Test
    void test(){
        assertNotEquals(234,234);
    }
}