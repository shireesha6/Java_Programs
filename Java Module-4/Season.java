import java.util.Scanner;
public class Season {
          public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month: ");
        String month = sc.nextLine();
                  if (month.equalsIgnoreCase("March") ||
                month.equalsIgnoreCase("April") ||
            month.equalsIgnoreCase("May")) {
            System.out.println("Summer");
        }
              else if (month.equalsIgnoreCase("June") ||
                   month.equalsIgnoreCase("July") ||
                 month.equalsIgnoreCase("August") ||
                  month.equalsIgnoreCase("September")) {
            System.out.println("Rainy");
        }
        else if    (month.equalsIgnoreCase("October") ||
                 month.equalsIgnoreCase("November")) {
            System.out.println("Autumn");
        }
        else if    (month.equalsIgnoreCase("December") ||
                 month.equalsIgnoreCase("January") ||
                  month.equalsIgnoreCase("February")) {
            System.out.println("Winter");
        }
          else {
            System.out.println("Invalid Month");
        }
        sc.close();
    }}
