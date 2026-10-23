
package studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice = 0;

        while (choice != 6) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        manager.addStudent();
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        manager.searchStudent();
                        break;

                    case 4:
                        manager.updateStudent();
                        break;

                    case 5:
                        manager.deleteStudent();
                        break;

                    case 6:
                        System.out.println("Exiting application...");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid menu number.");
            }
        }

        sc.close();
    }
}
