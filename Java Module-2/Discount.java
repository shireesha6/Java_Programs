import java.util.Scanner;
public class Discount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double price = sc.nextDouble();
System.out.print("Enter the discount %: ");
        double d = sc.nextDouble();
        double total=price-(price*d/100);
        System.out.println("the total price after discount is :" + total);
        sc.close();
    }
}
