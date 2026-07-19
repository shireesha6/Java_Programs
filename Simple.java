import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
System.out.println("enter principal ammount ");
double p=sc.nextDouble();
System.out.println("enter rate ");
double r=sc.nextDouble();
    System.out.println("enter time ");
double t=sc.nextDouble();
 double s=(p*t*r)/100;
System.err.println("simple intrest"+s);
sc.close();
}
}

