import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class exercises {

    private static final Scanner scanner = new Scanner(System.in);

//    morning warmup. take in a number and add every number starting at 1 going up to the established number
    public static int addingUp (int num) {
        int bucket = 0;
        for (int i = 0; i <= num; i++) {
            bucket += i;
        }
        return bucket;
    }

//    morning warmup. accept two numbers and use them as base and exponent
    public static void square (double base, double exp) {

        System.out.println(Math.pow(base,exp));
    }

//    ###5 John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int count=0;
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                count=count+1;
                i=i+1;
            }
        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) throws IOException {
        int[] ar = {1,2,1,2,1,3,2};
        sockMerchant(7, ar);
//
//        Scanner scanner = new Scanner(System.in);
////        ###5
//
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] ar = new int[n];
//
//            String[] arItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int arItem = Integer.parseInt(arItems[i]);
//                ar[i] = arItem;
//            }
//
//            int result = sockMerchant(n, ar);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();
//
//            scanner.close();
        }
    }


