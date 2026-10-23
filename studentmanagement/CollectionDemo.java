
package studentmanagement;

import java.util.HashMap;
import java.util.HashSet;

public class CollectionDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> studentNames = new HashMap<>();

        studentNames.put(101, "Rahul");
        studentNames.put(102, "Anita");
        studentNames.put(103, "Priya");

        System.out.println("===== Student Names Using HashMap =====");

        for (Integer id : studentNames.keySet()) {
            System.out.println("Student ID: " + id
                    + ", Name: " + studentNames.get(id));
        }

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Java");
        courses.add("SQL");

        System.out.println("\n===== Unique Courses Using HashSet =====");

        for (String course : courses) {
            System.out.println(course);
        }
    }
}
