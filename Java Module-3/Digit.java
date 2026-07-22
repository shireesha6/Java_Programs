import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a  3 digit num");
        int num=sc.nextInt();
        int h=num/100;
        int  t=(num/10)%10;
        int o=num%10;
        System.out.println("hundrends : "+h +"\n tens : "+t + "\nones :"+o);
        sc.close();
    }}