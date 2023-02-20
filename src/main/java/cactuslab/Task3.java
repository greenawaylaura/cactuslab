package cactuslab;

/**
 * Write a function that takes an array of numbers and returns the sum of the numbers.
 *
 */

public class Task3 {

    // I assumed the numbers in the given array would not be bigger than the maximum allowed by the Double data type
    public double arrayTotal(double[] numbers) {
        double total = 0;
        for (double i : numbers) {
            total = total + i;
        }
        return total;
    }

}
