import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int num = sc.nextInt();
        if (num>=35) {
            System.out.println(num + " is pass.");
        } else {
            System.out.println(num + " is fail.");
        }
        sc.close();
    }
}
