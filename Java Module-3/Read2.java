 import java.util.Scanner;
public class Read2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paragraph:");
        String l1= sc.nextLine();
        String l2 = sc.nextLine();
        String l3 = sc.nextLine();
        System.out.println("\nParagraph:");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        sc.close();
    }
} 
