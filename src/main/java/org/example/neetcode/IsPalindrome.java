package org.example.neetcode;

public class IsPalindrome {

    public Boolean isPalindrome (String word) {
        int pointerOne = 0;
        int pointerTwo = word.length() - 1;
        String wordToLowerCase = word.toLowerCase();


       while (pointerOne < pointerTwo) {
           if (wordToLowerCase.charAt(pointerOne) == wordToLowerCase.charAt(pointerTwo)){
               pointerOne++;
               pointerTwo--;

           } else {
               return false;
           }
       }
        return true;
    }
}
