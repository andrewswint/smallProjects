import javax.xml.transform.Result;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hackerRank {

    public static int minSec(int minutes) {
        return minutes * 60;
    }

    public static int convert(int hours, int minutes) {
        return ((hours * 60) * 60) + (minutes * 60);
    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static void checkType () {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        sc.close();
    }
    public static boolean isAnagram(String a, String b) {
            if (a.length() != b.length()) return false;
            a = a.toLowerCase();
            b = b.toLowerCase();
            int [] temp = new int [Character.MAX_VALUE];
            int summ = 0;
            for (int i = 0; i < a.length(); i++){
                summ += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
                summ += --temp [b.charAt(i)] >= 0 ? -1 : 1;
            }
            return summ == 0;
        }


    public static void main(String[] args) {

        System.out.println(isAnagram("hello", "Hello"));
//        Fails:
        System.out.println(isAnagram("xyzw", "xyxy"));
        System.out.println(isAnagram("bbcc", "dabc"));

    }

}


