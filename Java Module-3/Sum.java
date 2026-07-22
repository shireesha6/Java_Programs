import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second num:");
        int n2 = sc.nextInt();
         System.out.print("Enter the third num:");
         int n3= sc.nextInt();
        int sum = n1+n2+n3;
        System.out.println("The sum of " + n1 + " and " + n2 + " and " + n3 + " is: " + sum);
        sc.close();
    }

}
