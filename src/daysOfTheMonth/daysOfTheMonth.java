package daysOfTheMonth;

import java.util.*;

public class daysOfTheMonth {

    public static void main (String[] args) {

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

        Object[] keyValue = months.keySet().toArray();
        Object key = keyValue[new Random().nextInt(keyValue.length)];

//        gives me a random month
        System.out.println(key);

//        gives me the random int associated with the month
        System.out.println(months.get(key));

        List<Map.Entry<String, Integer>> list = new ArrayList<>(months.entrySet());

        Collections.shuffle(list);
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }

    }

}
