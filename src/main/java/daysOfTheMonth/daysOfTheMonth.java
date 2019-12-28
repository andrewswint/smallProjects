package daysOfTheMonth;

import java.util.*;
import util.Input;


public class daysOfTheMonth {


    public static void main (String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> months = new HashMap<>();
        months.put("January", 31);
        months.put("February", 28);
        months.put("March", 31);
        months.put("April", 30);
        months.put("May", 31);
        months.put("June", 30);
        months.put("July", 31);
        months.put("August", 31);
        months.put("September", 30);
        months.put("October", 31);
        months.put("November", 30);
        months.put("December", 31);


//        System.out.println(key);

//        gives me the random int associated with the month
//        System.out.println(months.get(key));

        List<Map.Entry<String, Integer>> list = new ArrayList<>(months.entrySet());

//        shuffles the entire list
//        Collections.shuffle(list);
//        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry.getKey() + " :: " + entry.getValue());
//        }


        String continueInput = "y";
        int userInput;
        do {
            //        gives me a random month
            Object[] keyValue = months.keySet().toArray();
            Object key = keyValue[new Random().nextInt(keyValue.length)];
            System.out.printf("How many months in %s%n", key);
            Input input = new Input();
            userInput = input.getInt(0,1000);
            if (userInput == months.get(key)){
                System.out.println("that's correct! would you like to try again? [y/n]");
                continueInput = sc.next();
            } else if (userInput != months.get(key)){
                System.out.println("nope, try again");
            }

        } while (continueInput.equalsIgnoreCase("y"));

    }

}
