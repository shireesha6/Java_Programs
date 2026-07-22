import java.util.Scanner;
public class Product {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the  name of product ");
      String p  = sc.nextLine();
       System.out.print("Enter the  price ");
      int price  = sc.nextInt();
       System.out.print("Enter the  quality of product ");
       double q = sc.nextDouble();
       System.out.println("The entered details are:");
        System.out.println("Product Name: " + p);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quality: " + q);
        sc.close();
   }}



    

