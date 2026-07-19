import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
System.out.println("enter length");
        int length=sc.nextInt();
        System.out.println("enter breadth");
       int  breadth=sc.nextInt();
int rect=length*breadth;
System.err.println(" area of retangle "+ rect);
sc.close();
    }
    
}
