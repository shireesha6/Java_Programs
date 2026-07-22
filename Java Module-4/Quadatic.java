import java.util.Scanner;
public class Quadatic {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    double a=sc.nextDouble();
    System.out.print("Enter the value of b: ");
    double b=sc.nextDouble();
    System.out.print("Enter the value of c: ");
    double c=sc.nextDouble();
    double d=b*b-4*a*c;
    if(d>0)
    {
        System.out.println("Roots are real and different");
        double r1=(-b+Math.sqrt(d))/(2*a);
        double r2=(-b-Math.sqrt(d))/(2*a);
    }

else if(d==0)
    {
System.out.println("Roots are real and same");
        double r1=-b/(2*a);
        System.out.println("Root is: "+r1);
    }
    else
    {
        System.out.println("Roots are complex and different");
    }
    sc.close();

}}