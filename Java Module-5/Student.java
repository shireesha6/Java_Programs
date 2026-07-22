import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Student Added");
                break;
            case 2:
                System.out.println("Student Details");
                break;
            case 3:
                System.out.println("Student Deleted");
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}