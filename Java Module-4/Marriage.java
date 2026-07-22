import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if ((gender == 'M' || gender == 'm') && age >= 21) {
            System.out.println("Eligible for Marriage");
        }
        else if ((gender == 'F' || gender == 'f') && age >= 18) {
            System.out.println("Eligible for Marriage");
        }
        else {
            System.out.println("Not Eligible for Marriage");
        }

        sc.close();
    }
}