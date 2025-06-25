// src/Main.java
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📚 Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    dao.addStudent(new Student(name, age, course));
                    break;

                case 2:
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\nStudent List:");
                    for (Student s : students) {
                        System.out.println("ID: " + s.getId() + ", Name: " + s.getName() +
                                           ", Age: " + s.getAge() + ", Course: " + s.getCourse());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int upId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String upName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int upAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new course: ");
                    String upCourse = scanner.nextLine();
                    dao.updateStudent(new Student(upId, upName, upAge, upCourse));
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = scanner.nextInt();
                    dao.deleteStudent(delId);
                    break;

                case 5:
                    System.out.println("🚪 Exiting...");
                    break;

                default:
                    System.out.println("❗ Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
