/*Question 1. WAP to insert three integer numbers at run time and print largest number.
*/
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

       

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);
    }
}
/*Question 2. WAP to enter any character value & check the value is vowel or consonant.
*/
import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The entered character is a vowel.");
            } else {
                System.out.println("The entered character is a consonant.");
            }
        } else {
            System.out.println("Invalid input: Not a valid letter.");
        }
    }
}
/*Question 3. WAP to find even and odd numbers between 11 to 109 numbers
*/
public class EvenOddFinder {
    public static void main(String[] args) {
        System.out.println("Even numbers between 11 and 109:");
        for (int i = 11; i <= 109; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n Odd numbers between 11 and 109:");
        for (int i = 11; i <= 109; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

/*Question 4.WAP to count total even and total odd numbers between 11 to 109 numbers.
*/
public class EvenOddCounter {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 11; i <= 109; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers between 11 and 109: " + evenCount);
        System.out.println("Total odd numbers between 11 and 109: " + oddCount);
    }
}
