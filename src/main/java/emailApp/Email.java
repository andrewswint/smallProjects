package emailApp;
import util.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private String company;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;

//    constructor for first name and last name
    public Email (String firstName, String lastName) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.company = setCompany();
        this.password = randomPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + company + ".com";
        System.out.println(email);
        System.out.println(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

//    ask for the department
    private String setDepartment() throws Exception {
        Input input = new Input();
//        Scanner sc = new Scanner(System.in);
        System.out.print("enter department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
        int userInput = input.getInt(0,5);
//        int userInput = sc.nextInt();
        if (userInput == 1) {
            return "Sales";
        } else if (userInput == 2) {
            return "Development";
        } else if (userInput == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }


//    ask for company
    private  String setCompany() {
        Input input = new Input();
        System.out.println("What company does the account holder work for?");
        String newCompany = input.getString();
        return newCompany;
    }

//    generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomNumber);
        }
        return new String(password);
    }

//    set the mailbox capacity

//    set alternate email

//    change the password

}
