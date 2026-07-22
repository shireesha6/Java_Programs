import java.util.Scanner;
public class Recharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rs.199");
        System.out.println("2. Rs.299");
        System.out.println("3. Rs.499");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
 switch (ch) {
          case 1:
            System.out.println("Recharge of Rs.199 Successful");
                  break;
              case 2:
          System.out.println("Recharge of Rs.299 Successful");
                break;
           case 3:
                System.out.println("Recharge of Rs.499 Successful");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}
