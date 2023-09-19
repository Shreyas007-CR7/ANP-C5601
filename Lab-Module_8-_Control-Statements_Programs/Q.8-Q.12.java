/*Question 9. WAP to take any three digit number and check number is Armstrong.(Hint: 153=1*1*1+5*5*5+3*3*3)
*/
import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (digit * digit * digit);
            number /= 10;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
/*Question 10. WAP to print the table of a number.(Hint:  2*1=2,2*2=4,2*3=6….2*10=20)
*/
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
/*Question 11. WAP to find the factorial of any number. (Hint: !5=5*4*3*2*1=120)
*/
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
/*Question 12.WAP to find the Fibonacci series up to 10 terms  (Hint: 0 1 1 2 3 5 8 13 21 34 55 89).
*/
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
