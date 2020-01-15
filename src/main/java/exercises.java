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

        }
    }


