import java.util.Scanner;
public class Circumfrence {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
     System.out.println("enter radius");
        double r=sc.nextDouble();
     double c=(2*Math.PI*r);
    System.out.println("the  circumfrence od circle: " + c);
    sc.close();
}
    }