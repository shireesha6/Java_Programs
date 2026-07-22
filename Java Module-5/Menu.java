import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice:");
        System.out.println("===== MENU =====");
        System.out.println("1. Pizzaz");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Exit");

         
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("pizza order");
                break;

            case 2:
                System.out.println("  burger order");
                break;

            case 3:
                System.out.println("pasta order");
                break;

            case 4:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}