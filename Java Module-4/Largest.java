import java.util.Scanner;
public class Largest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st num:");
        int a=sc.nextInt();
        System.out.println("enter 2nd num:");
        int b=sc.nextInt();
        System.out.println("enter 3rd num:");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(" a is largest");
        }
        else if(b>c)
        {
            System.out.println(" b is largest");
        }
        else
        {
            System.out.println(" c is largest");
        }
        sc.close();
        }
    }
