import java.util.Arrays;
import java.util.*;

public class edabit {

////    1. finding the largest number in an array
//    public static void arrayLargest (int[] arr) {
//        Arrays.sort(arr);
//        int i = arr.length - 1;
//        System.out.println(arr[i]);
//    }
//
////    reverse a string
//    public static void reverseString (String split) {
//        char[] reverse = split.toCharArray();
//        for (int i = reverse.length - 1; i >= 0; i--) {
//            System.out.println(reverse[i]);
//        }
//
////        StringBuilder split1 = new StringBuilder();
////        split1.append(split);
////        split1.reverse();
////        System.out.println(split1);
//    }

//    1. Create a function that returns true if two lines rhyme and false otherwise. For the purposes of this exercise, two lines rhyme if the last word from each sentence contains the same vowels.

//    public static void rhymes (String one, String two) {
//        String[] arr1 = one.split(" ");
//        String[] arr2 = two.split(" ");

//    }

//1. Write a Java program to find a specified element in a given array of elements using Binary Search.
        public static int binarySearch(int[] nums, int flag) {
            int hi_num = nums.length - 1;
            int lo_num = 0;
            while (hi_num >= lo_num) {
                int guess = (lo_num + hi_num);
                if (nums[guess] > flag) {
                    hi_num = guess - 1;
                } else if (nums[guess] < flag) {
                    lo_num = guess + 1;
                } else {
                    return guess;
                }
            }
            return -1;
        }


    public static void main(String[] args) {

//        //    1. finding the largest number in an array test
//        int[] findTheLargest = {1,2,3,4,5,6,7,8,9,-1,-3,16,-27};
//        arrayLargest(findTheLargest);
//
//        //    reverse a string
//        reverseString("hello");

//1.
        int[] nums = {1, 5, 6, 7, 8, 11};
        int search_num = -2;
        int index = binarySearch(nums, search_num);
        if (index == -1) {
            System.out.println(search_num + " is not in the array");
        } else {
            System.out.println(search_num + " is at index " + index);
        }

//        2. Write a Java program to create a Date object using the Calendar class.
        int year = 2019;
        int month = 11;
        int date = 19;

        Calendar cal = Calendar.getInstance();
        // Sets the given calendar value and the time value
        // (millisecond offset from the Epoch) of this Calendar undefined.
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
        System.out.println();

    }

}
