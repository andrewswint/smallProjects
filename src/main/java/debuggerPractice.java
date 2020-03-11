import java.util.Scanner;
import util.Input;

public class debuggerPractice {

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

}
