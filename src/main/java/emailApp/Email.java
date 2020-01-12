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
    private int mailboxCapacity = 500;
    private String alternateEmail;

//    constructor for first name and last name
    public Email () throws Exception {
        this.firstName = setFirstName();
        this.lastName = setLastName();
        this.department = setDepartment();
        this.company = setCompany();
        this.password = randomPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + company.toLowerCase() + ".com";
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

//    setters
    private String setFirstName() {
        Input input = new Input();
        System.out.println("What is the first name?");
        String first = input.getString();
        return first;
    }
    private String setLastName() {
        Input input = new Input();
        System.out.println("What is the last name?");
        String last = input.getString();
        return last;
    }

    //    set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //    set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //    change the password
    public void changePassword(String password) {
        this.password = password;
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

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
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

//    show all info
    public String showInfo() {
        return "display name: " + firstName + " " + lastName +
                "\ncompany email: " + email +
                "\npassword: " + password +
                "\nmailbox capacity: " + mailboxCapacity + "mb";
    }

}
