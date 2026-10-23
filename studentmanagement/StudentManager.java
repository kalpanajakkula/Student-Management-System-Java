
package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements ManagementService {

    private ArrayList<Student> students;
    private Scanner sc = new Scanner(System.in);

    public StudentManager() {
        students = FileHandler.loadStudents();
        System.out.println("Student records loaded successfully.");
    }

    private boolean isValidDetails(
            String name, String course, int age, double marks) {

        if (name.trim().isEmpty()
                || course.trim().isEmpty()
                || age <= 0
                || marks < 0
                || marks > 100) {

            System.out.println("Invalid student details!");
            return false;
        }

        return true;
    }

    private boolean isDuplicateId(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addStudent() {
        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            if (id <= 0) {
                System.out.println("Student ID must be positive.");
                return;
            }

            if (isDuplicateId(id)) {
                System.out.println("Student ID already exists!");
                return;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Marks: ");
            double marks = Double.parseDouble(sc.nextLine());

            if (!isValidDetails(name, course, age, marks)) {
                return;
            }

            Student student =
                    new Student(id, name, course, age, marks);

            students.add(student);
            FileHandler.saveStudents(students);

            System.out.println("Student added successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n===== Student Records =====");

        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void searchStudent() {
        try {
            System.out.print("Enter Student ID to search: ");
            int id = Integer.parseInt(sc.nextLine());

            for (Student s : students) {
                if (s.getStudentId() == id) {
                    System.out.println("Student Found!");
                    System.out.println(s);
                    return;
                }
            }

            System.out.println("Student not found.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid Student ID.");
        }
    }

    @Override
    public void updateStudent() {
        try {
            System.out.print("Enter Student ID to update: ");
            int id = Integer.parseInt(sc.nextLine());

            for (Student s : students) {
                if (s.getStudentId() == id) {
                    System.out.print("Enter new Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter new Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter new Marks: ");
                    double marks = Double.parseDouble(sc.nextLine());

                    if (!isValidDetails(name, course, age, marks)) {
                        return;
                    }

                    s.setName(name);
                    s.setCourse(course);
                    s.setAge(age);
                    s.setMarks(marks);

                    FileHandler.saveStudents(students);
                    System.out.println("Student updated successfully!");
                    return;
                }
            }

            System.out.println("Student not found.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }

    @Override
    public void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = Integer.parseInt(sc.nextLine());

            boolean removed = students.removeIf(
                    s -> s.getStudentId() == id
            );

            if (removed) {
                FileHandler.saveStudents(students);
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid Student ID.");
        }
    }
}
