import java.util.Scanner;
public class KMconveter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. KM to M");
        System.out.println("2. M to KM");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter KM: ");
                int km = sc.nextInt();
                System.out.println("Meters = " + (km * 1000));
                break;
            case 2:
                System.out.print("Enter Meters: ");
                int m = sc.nextInt();
                System.out.println("KM = " + (m / 1000.0));
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }}