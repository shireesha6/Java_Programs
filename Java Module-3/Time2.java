import java.util.Scanner;
public class Time2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in Seconds:");
        int s = sc.nextInt();
        int h=s/3600;
        int min =(s%3600)/60;
        int sec=s%60;
        System.out.println("hours: " + h +" minutes: " + min + " seconds: " + sec);
        sc.close();
    }
    
}
