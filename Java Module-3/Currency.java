 import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
System.out.println("enter the amount in rupees");
        double r=sc.nextDouble();
        double d=r/82.74;
        System.out.println("The amount in dollars is: " + d);
        sc.close();
    }
    
}
