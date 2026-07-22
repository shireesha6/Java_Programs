import java.util.Scanner;
public class Time  {
   public static void main(String[] var0) {
      Scanner sc= new Scanner(System.in);
      System.err.println("enter the hours");
      int h = sc.nextInt();
      int min=h*60;
      System.err.println("the time in minutes is: "+min);
      sc.close();
   }
}

