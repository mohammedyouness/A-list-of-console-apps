package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how many new students you want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student[] students = new Student[numOfStudents];

        // Generate n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());
        }
    }
}
