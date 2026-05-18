import java.util.Scanner;

public class t2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Result");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    System.out.println("\nStudent Name: " + name);
                    System.out.println("Marks: " + marks);

                    if (marks >= 90) {
                        System.out.println("Grade: A");
                    } else if (marks >= 75) {
                        System.out.println("Grade: B");
                    } else if (marks >= 50) {
                        System.out.println("Grade: C");
                    } else {
                        System.out.println("Grade: Fail");
                    }

                    break;

                case 2:

                    System.out.println("\nResult section opened.");

                    break;

                case 3:

                    System.out.println("\nExiting Program...");
                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("\nInvalid Choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}