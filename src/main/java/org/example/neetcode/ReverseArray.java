package org.example.neetcode;

public class ReverseArray {

    public int[] reverseArray(int[] arr) {
        int pointerOne = 0;
        int pointerTwo = arr.length - 1;

        while(pointerOne < pointerTwo) {
            //save the last number in a temporary variable
            int temp = arr[pointerTwo];

            //set the first number to equal the last
            arr[pointerTwo] = arr[pointerOne];

            //set the last number to equal the temporary variable
            arr[pointerOne] = temp;

            //increment up the first int in the array
            pointerOne++;

            pointerTwo--;

        }

        return arr;
    }
}
