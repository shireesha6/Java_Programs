import java.util.Scanner;
public class Disscount {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        double price=sc.nextDouble();
        if(price>5000)
        {
            double d=(price*0.5);
            System.out.println("Discount is: "+d);
        }
        else if(price>3000)
        {
            double d=price*0.3;
            System.out.println("Discount is: "+d);
        }
        else
        {
            double d=price*0.1;
            System.out.println("Discount is: "+d);
        }
        sc.close();
    }
}
