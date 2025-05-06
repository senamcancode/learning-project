package org.example.unit_tests;

import org.example.code_wars.GetMiddle;

public class GetMiddleTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1: " + GetMiddle.getMiddle("A")); // should print "A"
        System.out.println("Test Case 1: " + GetMiddle.getMiddle("middle")); // should print "dd"
        System.out.println("Test Case 2: " + GetMiddle.getMiddle("test"));   // should print "es"
        System.out.println("Test Case 3: " + GetMiddle.getMiddle("hello"));  // should print "l"
        System.out.println("Test Case 4: " + GetMiddle.getMiddle("a"));      // should print "a"
        System.out.println("Test Case 5: " + GetMiddle.getMiddle("abcd"));   // should print "bc"
    }
}