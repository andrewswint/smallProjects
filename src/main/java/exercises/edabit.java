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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(sc.hasNext()) {
            String input = sc.nextLine();
            i++;
            System.out.println(i + " " + input);
        }
    }

}
