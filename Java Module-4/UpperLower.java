import java.util.Scanner;
public class UpperLower 
    {
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
    char ch=sc.next().charAt(0);
    if((ch>'A' && ch<'Z') || (ch>'a' && ch<'z'))
        {
            System.out.println("the character is an alphabet");
        }
        else {
            System.out.println("the character is not an alphabet");
        }
        sc.close();
    
        }}

