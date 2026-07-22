import java.util.Scanner;
public class BMA {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
System.out.println("enter height");
        double h=sc.nextDouble();
        System.out.println("enter weight");
       double  w =sc.nextDouble();
       double bma = w / (h * h);
       System.out.println("The Body Mass Index (BMA) is: " + bma);
       sc.close();
    }
}
