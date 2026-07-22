 import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();
        if (amount % 100 != 0) {
            System.out.println("Enter amount in multiples of 100");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = ₹" + balance);
        }

        sc.close();
    }
}
