import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
         System.out.println("===== BANKING MENU =====");
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Balance Enquiry");
                break;
            case 2:
                System.out.println("Amount Deposited");
                break;
            case 3:
                System.out.println("Amount Withdrawn");
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    } }