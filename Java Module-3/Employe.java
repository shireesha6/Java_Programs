import java.util.Scanner;
public class Employe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String n = sc.nextLine();
         System.out.print("Enter the employe Id ");
        int r = sc.nextInt();
         System.out.print("Enter the employe salary ");
        int s = sc.nextInt();
        System.out.println("The entered details are:");
        System.out.println("Name: " + n);
        System.out.println("Employee Id: " + r);
        System.out.println("Employee Salary: " + s);
        sc.close();
    }
}
