import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
            System.out.print("Enter Length: ");
        int l = sc.nextInt();
             System.out.print("Enter Breadth: ");
                int b = sc.nextInt();
                System.out.println("Area = " + (l * b));
                break;
            case 2:
              System.out.print("Enter Radius: ");
                int r = sc.nextInt();
                System.out.println("Area = " + (3.14 * r * r));
                break;
            case 3:
             System.out.print("Enter Base: ");
                int base = sc.nextInt();
            System.out.print("Enter Height: ");
            int h = sc.nextInt();
                System.out.println("Area = " + (0.5 * base * h));
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}

