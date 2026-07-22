import java.util.Scanner;
public class LeafYear {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year:");
        int y=sc.nextInt();
        if((y%400==0)||( y % 4==0 && y % 100!=0))
        {
            System.out.println("the year is leaf year");
        }
        else
        {
            System.out.println("the year is not leaf year");
     
       }
       sc.close();
    }
    
}
