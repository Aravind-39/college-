import java.util.ArrayList;
import java.util.Scanner;


class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}


class Course {
    int code;
    String title;

    Course(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public String toString() {
        return "Code: " + code + ", Title: " + title;
    }
}


class CollegeManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== College Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> addCourse();
                case 4 -> viewCourses();
                case 5 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice, try again!");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("\n--- Student List ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    static void addCourse() {
        System.out.print("Enter Course Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Course Title: ");
        String title = sc.nextLine();
        courses.add(new Course(code, title));
        System.out.println("Course added successfully!");
    }

    static void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found!");
        } else {
            System.out.println("\n--- Course List ---");
            for (Course c : courses) {
                System.out.println(c);
            }
        }
    }
}
