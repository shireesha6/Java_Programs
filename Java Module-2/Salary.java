import java.util.Scanner;
public class Salary {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary=sc.nextDouble();
         System.out.println("Enter your house rent:");;
        double houseRent=sc.nextDouble();
         System.out.println("Enter your medical allowance:");
        double medical=sc.nextDouble();
        double hr=(salary*houseRent);
        double ma=(salary*medical);
        double Gross=(salary+hr+ma)/100;
        System.out.println("your gross salary is :" + Gross);
        sc.close();
    }
    
}
