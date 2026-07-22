import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== RESTAURANT MENU =====");
        System.out.println("1. Idli");
        System.out.println("2. Dosa");
        System.out.println("3. Biryani");
        System.out.println("4. Meals");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
         case 1:
            System.out.println("You selected Idli");
              break;
            case 2:
          System.out.println("You selected Dosa");
              break;
               case 3:
                 System.out.println("You selected Biryani");
                break;
                case 4:
                System.out.println("You selected Meals");
                break;
        case 5:
                System.out.println("Thank You! Visit Again.");
                break;
             default:
              System.out.println("Invalid Choice");
        }
        sc.close();
    }}
