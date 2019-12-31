package christmas;
import util.Input;

import java.util.Arrays;

public class Santa {

    public static Reindeer[] reindeer = new Reindeer[9];

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

    public static Reindeer[] addReindeer(Reindeer[] reindeer, Reindeer newReindeer) {
        reindeer = Arrays.copyOf(reindeer,reindeer.length + 1);
        reindeer[reindeer.length-1] = newReindeer;
        return reindeer;
    }


    public static void main(String[] args) {

//        santasQuestions();

        Reindeer donner = new Reindeer("donner");
        reindeer[0] = donner;

        Reindeer donner2 = new Reindeer("donner2");
        reindeer[1] = donner2;

        Reindeer donner3 = new Reindeer("donner3");
        reindeer[2] = donner3;

        Reindeer donner4 = new Reindeer("donner4");
        reindeer[3] = donner4;

        Reindeer donner5 = new Reindeer("donner5");
        reindeer[4] = donner5;

        Reindeer donner6 = new Reindeer("donner6");
        reindeer[5] = donner6;

        Reindeer donner7 = new Reindeer("donner7");
        reindeer[6] = donner7;

        Reindeer donner8 = new Reindeer("donner8");
        reindeer[7] = donner8;

        Reindeer donner9 = new Reindeer("donner9");
        reindeer[8] = donner9;

        Reindeer donner10 = new Reindeer("donner10");

        addReindeer(reindeer, donner10);

        System.out.println(reindeer.length);
    }
}
