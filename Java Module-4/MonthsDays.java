  import java.util.Scanner;
public class MonthsDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter Month: ");
        String month = sc.nextLine();
        if (month.equalsIgnoreCase("January") ||
            month.equalsIgnoreCase("March") ||
            month.equalsIgnoreCase("May") ||
            month.equalsIgnoreCase("July") ||
              month.equalsIgnoreCase("August") ||
            month.equalsIgnoreCase("October") ||
            month.equalsIgnoreCase("December")) {
            System.out.println("31 Days");
        }
        else if     (month.equalsIgnoreCase("April") ||
                 month.equalsIgnoreCase("June") ||
                 month.equalsIgnoreCase("September") ||
                 month.equalsIgnoreCase("November")) {
            System.out.println("30 Days");
            }
                 else if (month.equalsIgnoreCase("February")) {
               System.out.println("28 or 29 Days");
               }
                else {
                 System.out.println("Invalid Month");
        }
        sc.close();
}}