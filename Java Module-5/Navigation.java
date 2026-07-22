import java.util.Scanner;
public class Navigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Back");
        System.out.println("2. Forward");
        System.out.println("3. Refresh");
        System.out.println("4. Home");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Going Back");
             break;
            case 2:
                System.out.println("Going Forward");
                break;
            case 3:
                System.out.println("Page Refreshed");
                break;
            case 4:
                System.out.println("Home Page Opened");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}

