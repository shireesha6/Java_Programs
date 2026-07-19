import java.util.Scanner;
public class Gst {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double price = sc.nextDouble();
System.out.print("Enter the GSTt %: ");
        double gst = sc.nextDouble();
        double total=price+(price*gst/100);
        System.out.println("the total price after GST is :" + total);
        sc.close();
    }
}


