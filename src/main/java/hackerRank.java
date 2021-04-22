import java.util.Scanner;
import java.util.*;


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

    public static void stringToken(String s){
        String[] split = s.split("-|\\.|\\s|'|,|\\?|@|_|!");
        List<String> split2 = Arrays.asList(split);
        List<String> split3 = new ArrayList<>();
        for (int i = 0; i < split2.size(); i ++) {
            if (!split2.get(i).matches("")) {
                split3.add(split2.get(i));
            }
        }
        System.out.println(split3.size());
        StringBuilder split4 = new StringBuilder();
        for (int i = 0; i < split3.size(); i++) {
            split4.append(split3.get(i) + "\n");
        }
        System.out.println(split4);
    }


    public static void main(String[] args) {

        stringToken("He is a very very good boy, isn't he?");

    }

}


