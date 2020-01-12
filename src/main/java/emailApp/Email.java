package emailApp;
import util.Input;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;

//    constructor for first name and last name
    public Email (String firstName, String lastName) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
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
        System.out.print("enter department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
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
