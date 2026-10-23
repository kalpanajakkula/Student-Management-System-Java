
package studentmanagement;

public class StudentTask extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "Background task running: " + i
            );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static void main(String[] args) {
        StudentTask task = new StudentTask();

        task.start();

        System.out.println(
                "Student Management System is ready."
        );
    }
}
