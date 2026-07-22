import java.util.Scanner;
public class Employe {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
     System.out.println("1. Add Employee");
        System.out.println("2. View Employee");
        System.out.println("3. Remove Employee");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
    case 1:
                System.out.println("Employee Added");
                break;
       case 2:
                System.out.println("Employee Details");
                break;
         case 3:
             System.out.println("Employee Removed");
                break;

            case 4:
                 System.out.println("Thank You");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }}