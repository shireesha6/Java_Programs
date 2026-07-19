import java.util.Scanner;
public class Profit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double p= sc.nextDouble();
        System.out.print("Enter selling price: ");
        double s = sc.nextDouble();
    if(p<s)
    {
        System.out.println("the profit is:" +(s-p));
    }
    else if(p>s)
    {
        System.out.println("the loss is:" +(p-s));
    }
    else{
        
        System.out.println("no profit no loss");
    }
    sc.close();
    }
}
