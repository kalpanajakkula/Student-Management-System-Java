# Student Management System

## 1. Project Description

The Student Management System is a console-based Java application developed as part of the Week 6 Final Project. It helps manage student information such as Student ID, Name, Course, Age, and Marks.

The application allows users to add, view, search, update, and delete student records. It also uses file handling to save student information so that records can be loaded again when the application starts.

## 2. Features

- Add new student records.
- View all student records.
- Search for a student using Student ID.
- Update existing student details.
- Delete student records.
- Save and load student records using file handling.
- Validate user input and handle errors.
- Demonstrate HashMap and HashSet.
- Generate a student performance report.
- Demonstrate basic multithreading.

## 3. Technologies Used

- Programming Language: Java
- IDE: Eclipse
- Java Version: Java 17
- Collections: ArrayList, HashMap, HashSet
- File Handling: BufferedReader and BufferedWriter
- Data Storage: Text file (`students.txt`)

## 4. Java Concepts Used

### Classes and Objects
Classes are used to organize the program, and objects represent individual students.

### Constructors and `this`
Constructors initialize student details. The `this` keyword can be used to refer to the current object's variables.

### Encapsulation
Private variables and getter/setter methods help control access to student information.

### Inheritance
The Student class extends the Person class to reuse common details such as name and age.

### Polymorphism
Method overriding is used to provide a specific implementation of `displayDetails()` in the Student class.

### Abstraction
The abstract ReportGenerator class defines the structure for generating student reports.

### Interfaces
The ManagementService interface defines the main operations used to manage student records.

### Exception Handling
Exception handling and input validation help manage invalid input and other runtime errors.

### Collections
ArrayList stores student records, HashMap demonstrates key-value storage, and HashSet stores unique values.

### File Handling
BufferedReader and BufferedWriter are used to read and write student records in a text file.

### Multithreading
The StudentTask class demonstrates running a background task using a separate thread.

## 5. Project Structure

```text
internnovaproject
|
|-- src
|   |-- studentmanagement
|       |-- Main.java
|       |-- Person.java
|       |-- Student.java
|       |-- ManagementService.java
|       |-- StudentManager.java
|       |-- FileHandler.java
|       |-- CollectionDemo.java
|       |-- ReportGenerator.java
|       |-- StudentReport.java
|       |-- StudentTask.java
|
|-- students.txt
|-- README.md
```

## 6. How to Run the Project

1. Open Eclipse IDE.
2. Open the `internnovaproject` project.
3. Make sure all required Java files are present in the `studentmanagement` package.
4. Open `Main.java`.
5. Right-click and select **Run As → Java Application**.
6. Select an option from the console menu.
7. Enter the required student details when prompted.
8. Select Exit to close the application.

## 7. Sample Output

The following is an example of the main menu:

```text
===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Enter your choice:
```

Example student details:

```text
Student ID: 101
Name: Rahul
Course: Java
Age: 20
Marks: 85.0
```

The actual output may vary depending on the information entered by the user.

## 8. Future Improvements

- Add a graphical user interface.
- Connect the application to a database.
- Add login and authentication features.
- Generate downloadable student reports.
- Improve search and sorting options.

## 9. Conclusion

This project helped me practise Java programming and understand how to develop a menu-driven application. I learned how to use classes, objects, inheritance, interfaces, collections, exception handling, file handling, and multithreading. It also helped me understand how student records can be managed and stored using Java.
