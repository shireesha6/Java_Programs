import java.util.Scanner;
public class Digit
    {
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
    char ch=sc.next().charAt(0);
    if(ch>'1' && ch<'9')
        {
            System.out.println("the character is a digit");
        }
        else {
            System.out.println("the character is not an digit");
        }
        sc.close();
    
        }}

