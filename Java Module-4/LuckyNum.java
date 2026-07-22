import java.util.Scanner;
public class LuckyNum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
 int n=sc.nextInt();
int sum=0;
while (n>9) {
   sum=0;

 while(n>0)
 {
    sum=sum+(n%10);
    n=n/10;
 }
 n=sum;

    }
System.out.println("lucky number is:" +n);
    
}}


    
