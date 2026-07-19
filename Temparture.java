import java.util.Scanner;
public class Temparture {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter value");
       double  c=sc.nextDouble();
 double f=(c+9/5)+32;
System.out.println("converting of celcius to fahrenheit" +f);
sc.close();}
    
}

