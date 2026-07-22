import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choice 1: Pizza");
        System.out.println("Choice 2: Burger");
        System.out.println("Choice 3: Sandwich");
        System.out.print("Select your choice: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("You have selected Pizza");
                break;
            case 2:
                System.out.println("You have selected Burger");
                break;
            case 3:
                System.out.println("You have selected Sandwich");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}