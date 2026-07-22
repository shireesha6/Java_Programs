import java.util.Scanner;
public class Age {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your bithday year: " );
        int DOB= sc.nextInt();
        System.out.println("enter the current year: " );
        int year = sc.nextInt();
        int age=year-DOB;
        System.out.println("your age is: " + age);
        sc.close();
    }
}
