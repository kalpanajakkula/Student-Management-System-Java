
package studentmanagement;

public class StudentReport extends ReportGenerator {

    @Override
    public void generateReport(Student student) {
        showTitle();
        student.displayDetails();

        if (student.getMarks() >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }

    public static void main(String[] args) {
        Student student = new Student(
                101, "Rahul", "Java", 20, 85
        );

        StudentReport report = new StudentReport();
        report.generateReport(student);
    }
}
