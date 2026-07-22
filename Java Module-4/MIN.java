 import java.util.Scanner;
public class MIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
          System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
            System.out.print("Enter Third Number: ");
          int c = sc.nextInt();
                 System.out.print("Enter Fourth Number: ");
        int d = sc.nextInt();
          if (a <= b && a <= c && a <= d) {
            System.out.println("Minimum = " + a);
        }
      else if (b <= a && b <= c && b <= d) {
            System.out.println("Minimum = " + b);
        }
                else if (c <= a && c <= b && c <= d) {
            System.out.println("Minimum = " + c);
        }
        else {
            System.out.println("Minimum = " + d);
        }
        sc.close();
    }}
