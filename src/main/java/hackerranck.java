import java.util.Scanner;

public class hackerranck {

    public static int minSec(int minutes) {
        return minutes * 60;
    }

    public static int convert(int hours, int minutes) {
        return ((hours * 60) * 60) + (minutes * 60);
    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(minSec(5));
        System.out.println(minSec(3));
        System.out.println(minSec(2));

        System.out.println(convert(1,3));

    }

}


