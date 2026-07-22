 import java.util.Scanner;
 public class MulInput{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String n = sc.nextLine();
        System.out.print("Enter the collage  name: ");
        String c = sc.nextLine();
        System.out.print("Enter the department name: ");
        String d = sc.nextLine();
        System.out.println("The entered details are:");
        System.out.println("Name: " + n);
        System.out.println("Collage Name: " + c);
        System.out.println("Department Name: " + d);
        sc.close();
    }
 }
