import java.util.Scanner;
public class Scholar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        System.out.print("Enter Family Income: ");
        double income = sc.nextDouble();
        if (marks >= 90 && income < 200000) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }
        sc.close();
    }
}
