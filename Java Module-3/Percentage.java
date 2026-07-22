import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("marks of subject 1");
        int s1=sc.nextInt();
        System.out.println("marks of subject 2");
       int  s2 =sc.nextInt();
       System.out.println(" marks of subject 3");
       int  s3 =sc.nextInt();
       System.out.println("marks of subject 4");
       int  s4 =sc.nextInt();
       System.out.println("marks of subject 5");
       int  s5 =sc.nextInt();
       double s=s1+s2+s3+s4+s5;
       double percentage=(s/500)*100;
       System.out.println("The percentage is: " + percentage);
       sc.close();
    }
    
}
