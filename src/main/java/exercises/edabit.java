package exercises;
import java.io.*;
import java.util.*;


public class edabit {

    public static int perimeter (int height, int width) {
        if (height == 0 || width == 0) {
            return 0;
        }
        return (2 * (height + width));
    }

    public static String name(String first, String last) {
        return first + " " + last;
    }

    public static int parallelogram(int b, int h) throws Exception {
        if (b > 0 && h > 0) {
            return b * h;
        } else {
            throw new Exception("Breadth and height must be positive");
        }
    }


    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
        parallelogram(-1,2);
    }
}

