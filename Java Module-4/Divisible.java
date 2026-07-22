import java.util.Scanner;
public class Divisible{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if((num%11==0) && (num%5==0)){
            System.out.println("the number is divisible by both 11 and 5");
        }
        else{
            System.out.println("the number is not divisible by both 11 and 5");
        }
        sc.close();
            }      
}

