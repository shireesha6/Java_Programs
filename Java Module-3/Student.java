import java.util.Scanner;
 public class Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String n = sc.nextLine();
         System.out.print("Enter the roll number ");
        int r = sc.nextInt();
         System.out.print("Enter the year ");
        int y = sc.nextInt();
         System.out.print("Enter the CGP ");
        double c = sc.nextDouble();
        System.out.println("The entered details are:");
        System.out.println("Name: " + n);
        System.out.println("Roll Number: " + r);
        System.out.println("Year: " + y);
        System.out.println("CGP: " + c);
        sc.close();
    }
 }