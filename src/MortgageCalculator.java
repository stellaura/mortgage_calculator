/* Principal: 100000
   Annual Interest Rate: 3.92
   Period (Years): 30
   Mortgage: $472.81 this is being calculated from the data above
   The formula: M = P * ( r(1+r)^n / r(1+r)^n - 1 )
        P: Principal (loan amount)
        r: Monthly interest rate (annual interest rate divided by 12)
        n: Total number of payments (loan term in years multiplied by 12)*/
import java.util.Scanner;
public class MortgageCalculator {

    public static double calculateMonthlyPayment(double principal, double annualInterestRate, int loanTermYears) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int totalPayments = loanTermYears * 12;

        return principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) -1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan term years: ");
        int loanTermYears = scanner.nextInt();

        double monthlyPayment = calculateMonthlyPayment(principal, annualInterestRate, loanTermYears);
        System.out.println("Monthly payment is " + Math.round(monthlyPayment) + " HUF");

        scanner.close();
    }
}