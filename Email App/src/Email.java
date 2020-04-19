package emailapp;
import java.util.Scanner;
public class Email {

    private String firstName, lastName, department, password, email, companySuffix = ".company.com", alternateEmail;
    private int mailboxCapacity = 500, defaultPasswordLength = 12;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        // Combine elements to generate an email
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + companySuffix;
//        System.out.println("Your email is " + email);
    }
    // Ask for the department
    private String setDepartment() {
        System.out.print("New Worker: " + firstName + " - DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();
        if(departmentChoice == 1) { return "sales"; }
        else if(departmentChoice == 2) { return "development"; }
        else if(departmentChoice == 3) { return "accounting"; }
        else { return ""; }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$%^&*!?";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    /* Setters */
    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) { this.mailboxCapacity = capacity; }
    // Set the alternate email
    public void setAlternateEmail(String altEmail) { this.alternateEmail = altEmail; }
    // Change the password
    public void changePassword(String password) { this.password = password; }

    /* Getters */
    // Get the mailbox capacity
    public int getMailboxCapacity() { return mailboxCapacity; }
    // Get the alternate email
    public String getAlternateEmail() { return alternateEmail; }
    // Get the password
    public String getPassword() { return password; }



    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "GB";
    }



}
