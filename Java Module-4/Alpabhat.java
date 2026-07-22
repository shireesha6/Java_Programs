import java.util.Scanner;
public class Alpabhat 
    {
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
    char ch=sc.next().charAt(0);
    if((ch>'a' && ch<'z')|| (ch>'A' && ch<'Z'))
        {
            System.out.println("the character is an alphabet");
        }
        else {
            System.out.println("the character is not an alphabet");
        }
        sc.close();
    
        }}

