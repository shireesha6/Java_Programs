import java.util.Scanner;
public class EMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double p = sc.nextDouble();
        System.out.print("Annual Interest Rate (%): ");
        double annualRate = sc.nextDouble();
        System.out.print("Loan Tenure (Months): ");
        int n = sc.nextInt();
        double r = annualRate / (12 * 100);
        double emi = (p * r * Math.pow(1 + r, n))
                   / (Math.pow(1 + r, n) - 1);
        System.out.println("Monthly EMI = " + emi);
        sc.close();
    }

}
