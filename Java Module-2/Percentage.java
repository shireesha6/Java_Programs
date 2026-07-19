import java.util.Scanner;
public class Percentage {
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.println("enter total marks you got :");
double m=sc.nextDouble();
System.out.println("enter total  marks");
double t=sc.nextDouble();
  double   Percentage=(m/t)*100;
  System.out.println("your percentage is :" + Percentage);
sc.close();
    }
    
}
