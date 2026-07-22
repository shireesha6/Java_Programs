import java.util.Scanner;
public class pitfalls {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a  id:");
    int id=sc.nextInt();
    sc.nextLine(); 
    System.out.println("enter a name");
    String name=sc.nextLine();
    System.out.println("the id is " + id);
      System.out.println("the name is " + name);
    sc.close();
}
}
