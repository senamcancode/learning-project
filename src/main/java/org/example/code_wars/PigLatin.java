package org.example.code_wars;

import java.util.ArrayList;
import java.util.Arrays;

public class PigLatin {
    public static String pigIt(String string) {
        // Write code here

        //separate each word via space and put in array(regex)
        String[] strArray = string.split("\\s+");

        ArrayList<String> newStringArray = new ArrayList<>();

        for (String str : strArray) {

            //crop out the first letter
            String firstLetterFromFirstString = str.substring(0, 1);
            String remainingLettersFirstString = str.substring(1);

            String addingAyToLetters = firstLetterFromFirstString + "ay";

            String newString = remainingLettersFirstString + addingAyToLetters;

            newStringArray.add(newString);

        }

        return newStringArray.toString();

    }
}