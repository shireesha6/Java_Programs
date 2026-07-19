import java.util.Scanner;
public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        double d = sc.nextDouble();
         System.out.print("time taken ");
        double t= sc.nextDouble();
        double Speed=d/t;
        System.out.println("the speed is :" + Speed);
        sc.close();
    }
}
