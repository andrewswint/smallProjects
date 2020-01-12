package emailApp;
import util.Input;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

//    constructor for first name and last name
    public Email (String firstName, String lastName) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

//    set the mailbox capacity

//    set alternate email

//    change the password

}
