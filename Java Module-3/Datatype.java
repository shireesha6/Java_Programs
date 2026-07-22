 import java.util.Scanner;
public class Datatype 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();;
        System.out.println("Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);

        sc.close();
    }
}

