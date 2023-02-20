package cactuslab;

/**
 * Write a function that returns true if the first letter of a string is uppercase.
 *
 * URL I used: https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
 */


public class Task1 {

    public boolean isCapitalised(String s) {
        char firstLetter = s.charAt(0);
        return Character.isUpperCase(firstLetter);
    }
}
