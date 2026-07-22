import java.util.Scanner;
public class Eletricity {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of units consumed: ");
double units=sc.nextDouble();
if(units<=100)
{
    units=units*2;
    System.out.println("Total bill is: "+units);
}
else if(units<=200)
{
    units=(100*2)+(units-100)*3;
    System.out.println(" Total bill is: "+units);
}
else{
    units=(100*2)+(100*3)+(units-200)*5;
    System.out.println("Total bill is: "+units);
}
sc.close();
}}