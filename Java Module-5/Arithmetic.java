import java.util.Scanner;
public class Arithmetic {
          public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     System.out.println("1. Addition");
     System.out.println("2. Subtraction");
     System.out.println("3. Multiplication");
    System.out.println("4. Division");
            System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
    System.out.print("Enter First Number: ");
        int a = sc.nextInt();
    System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;
            case 2:
                System.out.println("Difference = " + (a - b));
                break;
            case 3:
                System.out.println("Product = " + (a * b));
                break;
            case 4:
                System.out.println("Quotient = " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
          }}
