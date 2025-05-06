package org.example.unit_tests;

import org.example.neetcode.MoveZeros;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextNonZeroTest {
    private static MoveZeros moveZeros;

    @BeforeAll
    static void setUp() {
       moveZeros = new MoveZeros();
    }

    @Test
    public void testMovesZerosToEnd_correctly() {
        int[] testArray = new int[]{0,4,0,5,0,3};

        int[] sortedArray =  moveZeros.MoveZerosInPlace(testArray);
        assertArrayEquals(new int[] {4,5,3,0,0,0}, sortedArray);
    }

}
