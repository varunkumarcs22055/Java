package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoursePTest {

    @Test
    void purchased() {
        CourseP c = new CourseP();
        boolean status = c.purchased(new JavaCourse());
        assertTrue(status);
    }
}