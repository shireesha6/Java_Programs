import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
System.out.println("enter principal ammount ");
double p=sc.nextDouble();
System.out.println("enter rate ");
double r=sc.nextDouble();
    System.out.println("enter time ");
double t=sc.nextDouble();
double amount=(p*Math.pow(1+r/100,t));
 double cp=amount-p;
System.out.println("the compound inttrest :"+ cp);
sc.close();
}
}
