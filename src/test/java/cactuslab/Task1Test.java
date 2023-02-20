package cactuslab;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task1Test {

    @Test
    public void shouldBeTrue() {
        Task1 task1 = new Task1();
        assertTrue(task1.isCapitalised("Laura"));
        assertTrue(task1.isCapitalised("LAURA"));
        assertTrue(task1.isCapitalised("Z"));

    }

    @Test
    public void ShouldBeFalse() {
        Task1 task1 = new Task1();
        assertFalse(task1.isCapitalised("laura"));
        assertFalse(task1.isCapitalised("lAURA"));
        assertFalse(task1.isCapitalised("y"));
        assertFalse(task1.isCapitalised("12345"));

    }
}
