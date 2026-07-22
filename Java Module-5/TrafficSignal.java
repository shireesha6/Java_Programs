import java.util.Scanner;
public class TrafficSignal {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
         System.out.println("1. Red");
          System.out.println("2. Yellow");
          System.out.println("3. Green");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
         switch (ch) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Choice");
        }
            sc.close();
    }}