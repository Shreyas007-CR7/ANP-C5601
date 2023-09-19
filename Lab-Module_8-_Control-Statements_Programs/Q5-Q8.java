/*Question 5.WAP to take a number at run time and check number is “prime” or “not prime
*/
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

/*Question 6.WAP to take any number more than 3 digits and sum them using “while loop”.
*/
import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number with more than 3 digits: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
    }
}
/*Question 7.WAP to take a number more than 1 digit at run time and print the same number in reverse order.  Hint: 1234 to 4321 or 53628 to 82635
*/
import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number with more than 1 digit: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
/*Question 8. WAP to take a number through keyboard & check number is palindrome number.    Hint:  121, 12321, 54645 etc are palindrome number.
*/
import java.util.Scanner;

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}

