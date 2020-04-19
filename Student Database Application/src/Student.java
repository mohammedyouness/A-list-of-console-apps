package studentdatabaseapp;
import java.util.Scanner;
public class Student {
    private String firstName;
    private String lastName;
    private String courses = "";
    private String studentID;
    private int gradeYear, tuitionBalance = 0;
    private static int id = 1000, costOfCourse = 600;

    // Constructor: prompt to user to enter student's name and year
    public Student() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's first name: ");
        this.firstName = input.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = input.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's grade level: ");
        this.gradeYear = input.nextInt();

        setStudentID();

    }

    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        while (1 != 0) {
        System.out.print("Enter course to enroll (Q to quit): ");
        Scanner input = new Scanner(System.in);
        String course = input.nextLine();
        if(!course.equalsIgnoreCase("Q")) {
            courses += "\n " + course;
            tuitionBalance  += costOfCourse;
        }
        else {
            break;
        } }

    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    // Pay Tuition
    public void payTuition() {
        Scanner input = new Scanner(System.in);
        viewBalance();
        System.out.print("Enter your payment: $");
        int payment = input.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses+
                "\nBalance: " + tuitionBalance;
    }


}
