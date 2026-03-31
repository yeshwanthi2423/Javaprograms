// Program: Student Management System
// Description: Allows user to add and view student details.
// Concept: Arrays, loops, menu-driven program

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        int[] marks = new int[100];
        int count = 0;

        int choice;

        do {
            System.out.println("\n📚 Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.println("\n📋 Student List:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + names[i] + " - " + marks[i]);
                    }
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
