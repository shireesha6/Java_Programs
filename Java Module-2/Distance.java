import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed: ");
        double s= sc.nextDouble();
         System.out.print("time taken ");
        double t= sc.nextDouble();
        double distance=s*t;
        System.out.println("the distance is :" + distance);
        sc.close();
    }
}

