package org.example.neetcode;

public class RemoveElementClass {

    public int[] removeElement(int[] nums, int val) {

        //check the value of the int in the array - if the value is equal AND the value of int next to it (i +1) is not equal to val - shift the numbers in the array left
        //if the value is at the end (delete from the end)
//        int length = nums.length;

        //iterate through the array
        for (int i = 0; i < nums.length - 1; i++) {
            //check the value of the int in the array is equal to val
//            if (nums[i] == val && nums[i] == nums.length - 1) {
//                nums[length - 1] = 0;
//                length--;
//            }


            if(nums[i] == val && i == 0){
                nums[i] = 0;
            }

            if (nums[i] == val) {
                nums[i - 1] = nums[i];
            }



        }

        return nums;
    }
}



