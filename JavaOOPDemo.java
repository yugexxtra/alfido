import java.util.Scanner;

class Student {

    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}

class CollegeStudent extends Student {

    String course;

    CollegeStudent(String name, int marks, String course) {
        super(name, marks);
        this.course = course;
    }

    @Override
    void display() {
        System.out.println("\nCollege Student Details");
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + getMarks());
        System.out.println("Course: " + course);
    }
}

public class JavaOOPDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.print("\nEnter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        CollegeStudent s1 = new CollegeStudent(name, marks, course);

        s1.display();

        System.out.println("\nUpdated Marks Using Setter");
        s1.setMarks(marks + 5);

        System.out.println("New Marks: " + s1.getMarks());
    }
}