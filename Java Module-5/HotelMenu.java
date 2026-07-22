import java.util.Scanner;
public class HotelMenu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("===== HOTEL MENU =====");
       System.out.println("1. Single Room");
       System.out.println("2. Double Room");
        System.out.println("3. Deluxe Room");
       System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
           switch (ch) {
            case 1:
                System.out.println("Single Room Booked");
                break;
            case 2:
                System.out.println("Double Room Booked");
                break;
            case 3:
                System.out.println("Deluxe Room Booked");
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}