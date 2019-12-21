import java.util.Arrays;
import java.util.*;

public class small_stuff {

public static void conditional (int n) {
    if (n % 2 != 0) {
        System.out.println("Weird");
    } else if (n % 2 == 0 && n < 5) {
        System.out.println("Not Weird");
    } else if (n % 2 == 0 && n >= 6 && n <= 20) {
        System.out.println("Weird");
    } else if (n % 2 == 0 && n > 20) {
        System.out.println("Not Weird");
    } else {
        System.out.println(n);
    }
}

    public static void main(String[] args) {

        conditional(24);

    }

}
