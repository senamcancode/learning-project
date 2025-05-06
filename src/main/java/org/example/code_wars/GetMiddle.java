package org.example.code_wars;

import java.sql.SQLOutput;

public class GetMiddle {
    public static String getMiddle(String word) {

        int index = word.length() / 2;

        if (word.length() == 1) {
            return word;
        }

        if (word.length() % 2 == 1) {
            return word.substring(index , index + 1);

        }

        if (word.length() % 2 == 0) {
            return word.substring(index - 1, index+ 1);
        }

        return word;
    }

}
