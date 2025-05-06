package org.example.code_wars;

public class FindOdd {
    public static int findIt(int[] numbers) {
        //count how many times each number appears

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            //if number is equal to number in array numbers
            if (i == numbers[i]) {

                //if numbers is equal to numbers i + 1 for the whole array increment the count

                count++;

                for (int j = 1; j < numbers.length; j++) {
                    if(i == numbers[j]) {
                        count++;
                        System.out.println(count);

                    }

                }


            }
            System.out.println(count);




            if (count % 2 == 1){
                System.out.println(count);
                return count;
            }



        }



        return 0;
    }
}