import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        System.out.println("Sentence: " + s);
        sc.close();
    }
}

