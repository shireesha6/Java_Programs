 import java.util.Scanner;
public class Smallest {
    public static void main(String args[])
    {
     Scanner  sc=new Scanner(System.in);
     System.out.println("Enter  number a : ");
     int a=sc.nextInt();
     System.out.println("Enter  number b : ");
     int b=sc.nextInt();
     if(a<b)
     {
        System.out.println(" a is smaller than b");
     }
     else
     {
        System.out.println(" b is smallerthan a");
     }
     sc.close();
    }
}
 