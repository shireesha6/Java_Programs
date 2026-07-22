import java.util.Scanner;
public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. aashiqui 2");
        System.out.println("2. Dude");
        System.out.println("3. FROM");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("aashiqui 2 Ticket Booked");
                break;
            case 2:
                System.out.println("Dude Ticket Booked");
                break;
            case 3:
                System.out.println("FROM Ticket Booked");
                break;

            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}
