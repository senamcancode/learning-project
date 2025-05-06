package org.example.neetcode;

public class MoveZeros {

    public int[] MoveZerosInPlace(int[] array) {

        int currentPointer = 0;
        int zeroPointer = 0;
        int temp;

        //swap the non-zero number with the zero

        for(int i = 0; i < array.length - 1; i++) {
            if (array[currentPointer] == 0) {
                currentPointer++;
            }

            if (array[zeroPointer] == 0) {

            }

            if(array[zeroPointer] == 0 && array[currentPointer] != 0) {
                temp = array[currentPointer];

                array[zeroPointer] = temp;
                array[currentPointer] = 0;

                currentPointer++;
                zeroPointer++;
            }

            return array;
        }

        return array;
    }

}
