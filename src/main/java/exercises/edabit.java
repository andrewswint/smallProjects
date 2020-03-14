package exercises;
import java.io.*;
import java.util.*;


public class edabit {

    static int B;
    static int H;
    private static boolean flag = false;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            try {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    public static String name(String first, String last) {
//        return first + " " + last;
//    }
//
//    public static int parallelogram(int B, int H) throws Exception {
//        if (B > 0 && H > 0) {
//            return B * H;
//        } else {
//            throw new Exception("Breadth and height must be positive");
//        }
//    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}

