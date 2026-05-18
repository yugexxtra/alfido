import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class t3 {

    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Sneha");

        System.out.println("Student List:");
        for (String name : students) {
            System.out.println(name);
        }

        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Rahul");
        studentMap.put(102, "Aman");
        studentMap.put(103, "Sneha");

        System.out.println("\nStudent HashMap:");
        System.out.println(studentMap);

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Java");

        System.out.println("\nCourses HashSet:");
        System.out.println(courses);

        try {

            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();

            checkAge(age);

            int number = 10 / 0;

            System.out.println(number);

        } catch (InvalidAgeException e) {

            System.out.println("Custom Exception: " + e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception: Cannot divide by zero");

        } catch (Exception e) {

            System.out.println("General Exception: " + e.getMessage());

        } finally {

            System.out.println("Program Finished");
        }

        sc.close();
    }
}