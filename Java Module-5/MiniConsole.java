import java.util.Scanner;
public class MiniConsole{
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
      System.out.println("===== MINI CONSOLE APP =====");
        System.out.println("1. Calculator");
     System.out.println("2. Student Details");
        System.out.println("3. Employee Details");
        System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
 switch (choice) {
     case 1:
              System.out.print("Enter First Number: ");
                  int a = sc.nextInt();
                  System.out.print("Enter Second Number: ");
                int b = sc.nextInt();
                System.out.println("Sum = " + (a + b));
                break;
              case 2:
                System.out.println("Student Details Displayed");
                break;
            case 3:
                 System.out.println("Employee Details Displayed");
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}