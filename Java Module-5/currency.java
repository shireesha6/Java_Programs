import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
     int ch = sc.nextInt();
        switch(ch){
       case 1:
             System.out.println("INR to USD");
              break;
            case 2:
          System.out.println("USD to INR");
                break;
            default:
                System.out.println("Invalid Choice");
        }}}
