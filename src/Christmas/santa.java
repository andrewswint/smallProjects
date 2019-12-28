package Christmas;
import java.util.Scanner;
import util.Input;

public class santa {



    public static void santasQuestions () {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want for Christmas?");
        String userInput = sc.nextLine();
        if (userInput.length() == 0) {
            santasQuestions();
        }
        System.out.println(userInput);
    }

    public static void main(String[] args) {

        santasQuestions();

    }
}
