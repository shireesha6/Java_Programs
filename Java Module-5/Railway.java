import java.util.Scanner;
public class Railway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Book Ticket");
        System.out.println("2. Cancel Ticket");
        System.out.println("3. Check Status");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
                   case 1:
                  System.out.println("Ticket Booked");
                break;
                case 2:
                System.out.println("Ticket Cancelled");
                break;
              case 3:
                System.out.println("Ticket Status Displayed");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}
