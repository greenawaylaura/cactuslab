package cactuslab;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void shouldPass() {
        //I assumed accuracy offered by double was sufficient
        Task2 task2 = new Task2();

        assertEquals(task2.circleArea(0), 0, 0);
        assertEquals(task2.circleArea(5), 78.53981633974483, 0);
        assertEquals(task2.circleArea(100.75), 31888.93257980404, 0);
    }
}
