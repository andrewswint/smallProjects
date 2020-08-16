import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;

class dayOfTheWeek {




    public static String findDay(int month, int day, int year){
        String input_date = day + "/" + month + "/" + year;
        try {
            Date date = new SimpleDateFormat("dd/M/yyyy").parse(input_date);
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == 1) {
                return "SUNDAY";
            } else if (dayOfWeek == 2) {
                return "MONDAY";
            } else if (dayOfWeek == 3) {
                return "TUESDAY";
            } else if (dayOfWeek == 4) {
                return "WEDNESDAY";
            } else if (dayOfWeek == 5) {
                return "THURSDAY";
            } else if (dayOfWeek == 6) {
                return "FRIDAY";
            } else if (dayOfWeek == 7) {
                return "SATURDAY";
            } else return "try again";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";

    }


    public static void main(String[] args) throws IOException {
    findDay(8,5,2015);
    }
}

