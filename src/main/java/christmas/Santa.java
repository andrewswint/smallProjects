package christmas;
import util.Input;

public class Santa {



    public static void santasQuestions () {
        Input input = new Input();
        System.out.println("What do you want for Christmas?");
        String userInput = input.getString();
        if (userInput.length() == 0) {
            System.out.println("Please enter a valid response...");
            santasQuestions();
        }
        System.out.println(userInput);
    }

    public static void main(String[] args) {

        santasQuestions();

        Reindeer donner = new Reindeer("donner");


    }
}
