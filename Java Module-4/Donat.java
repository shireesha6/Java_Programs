import java.util.Scanner;
public class Donat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
            System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
           if (age >= 18 && weight >= 50) {
            System.out.println("Eligible to Donate Blood");
        }    else {
            System.out.println("Not Eligible to Donate Blood");
            }
        sc.close();
        }    }
