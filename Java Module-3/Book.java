 import java.util.Scanner;
public class Book {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the  book name: ");
      String b  = sc.nextLine();
        System.out.print("Enter the author name: ");
        String a = sc.nextLine();
         System.out.print("Enter the author price ");
        int p = sc.nextInt();
         System.out.print("Enter the book rating  ");
        double r = sc.nextDouble();
        System.out.println("The entered details are:");
        System.out.println("Book Name: " + b);
        System.out.println("Author Name: " + a);
        System.out.println("Book Price: " + p);
        System.out.println("Book Rating: " + r);
        sc.close();
}}
