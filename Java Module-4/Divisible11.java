import java.util.Scanner;
public class Divisible11{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num%11==0){
            System.out.println("the number is divisible by 11");
        }
        else{
            System.out.println("the number is not divisible by 11");
        }
        sc.close();
            }      
}

