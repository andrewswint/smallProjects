import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class small_stuff {

    private static final Scanner scanner = new Scanner(System.in);

//    morning warmup. take in a number and add every number starting at 1 going up to the established number
    public static int addingUp (int num) {
        int bucket = 0;
        for (int i = 0; i <= num; i++) {
            bucket += i;
        }
        return bucket;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        scan = new Scanner(System.in);
//        double d = scan.nextDouble();
//        scan = new Scanner(System.in);
//        String s = scan.next();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
        int num = scan.nextInt();
        System.out.println(addingUp(num));

    }

}

