
package studentmanagement;

public abstract class ReportGenerator {

    public abstract void generateReport(Student student);

    public void showTitle() {
        System.out.println("===== Student Performance Report =====");
    }
}
