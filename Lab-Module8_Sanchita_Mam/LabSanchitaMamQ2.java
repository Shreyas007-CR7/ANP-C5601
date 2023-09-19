import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the employee: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter the annual income: ");
        double annualIncome = scanner.nextDouble();

        double taxAmount = 0;

        if (annualIncome <= 250000) {
            taxAmount = 0;
        } else if (annualIncome <= 500000) {
            taxAmount = 0.1 * (annualIncome - 250000);
        } else if (annualIncome <= 1000000) {
            taxAmount = 30000 + 0.2 * (annualIncome - 500000);
        } else {
            taxAmount = 50000 + 0.3 * (annualIncome - 1000000);
        }

        System.out.println("Name: " + employeeName);
        System.out.println("Annual Income: ₹" + annualIncome);
        System.out.println("Income Tax: ₹" + taxAmount);

        scanner.close();
    }
}
