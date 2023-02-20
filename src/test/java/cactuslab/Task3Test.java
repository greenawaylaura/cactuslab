package cactuslab;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void shouldPass() {
        Task3 task3 = new Task3();

        double[] numberArray1 = {2, 2, 2};
        assertEquals(task3.arrayTotal(numberArray1), 6, 0);

        double[] numberArray2 = {5, 1, 0, 6, 8};
        assertEquals(task3.arrayTotal(numberArray2), 20, 0);

        double[] numberArray3 = {7};
        assertEquals(task3.arrayTotal(numberArray3), 7, 0);

        double[] numberArray4 = {0};
        assertEquals(task3.arrayTotal(numberArray4), 0, 0);

        double[] numberArray5 = {0.9, 1.1, 2.5, 6.7};
        assertEquals(task3.arrayTotal(numberArray5), 11.2, 0);

        double[] numberArray6 = {};
        assertEquals(task3.arrayTotal(numberArray6), 0, 0);

        double[] numberArray7 = {16, -4, 3};
        assertEquals(task3.arrayTotal(numberArray7), 15, 0);

    }
}
