import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         System.out.println("===== SHOPPING CART =====");
         System.out.println("1. Add Item");
         System.out.println("2. Remove Item");
     System.out.println("3. View Cart");
        System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Item Added");
                break;
            case 2:
                System.out.println("Item Removed");
                break;
            case 3:
                System.out.println("Cart Displayed");
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}