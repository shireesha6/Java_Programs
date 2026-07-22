 import java.util.Scanner;
public class Day{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day: ");
          String day = sc.nextLine();
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else if (day.equalsIgnoreCase("Monday") ||
                   day.equalsIgnoreCase("Tuesday") ||
                   day.equalsIgnoreCase("Wednesday") ||
                   day.equalsIgnoreCase("Thursday") ||
                   day.equalsIgnoreCase("Friday")) {
              System.out.println("Weekday");
        }    else {
            System.out.println("Invalid Day");
        }
        sc.close();
}}
