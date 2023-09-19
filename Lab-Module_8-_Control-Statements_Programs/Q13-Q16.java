/*Question 13. WAP to convert decimal number to binary.
*/
import java.io.*;

class DecimalToBinary
{
	static void decToBinary(int n)
	{
		int[] binaryNum = new int[1000];
        int i = 0;
		while (n > 0)
		{
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}
	public static void main (String[] args)
	{
		int n = 17;
		System.out.println("Decimal - " + n);
		System.out.print("Binary - ");
		decToBinary(n);
	}
}
/*Questio 14. WAP to convert binary number to decimal.
*/
class Main {
    
  public static void main(String[] args) {

    long num = 110110111;

    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}
/*Questio 15.  WAP to “add”, ”subtract”,  ”multiply”, ”division” using “switch”. (Press 1 for add, 2 for subtract, 3 for multiply and default for division).
*/
import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}

/*Questio 16.WAP to print 7 days of a week using switch.(a for Sunday,….. f for Friday, default  for Saturday)
*/
import java.util.Scanner;

public class DaysOfWeekUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character (a-f) to represent a day of the week:");
        System.out.println("a for Sunday");
        System.out.println("b for Monday");
        System.out.println("c for Tuesday");
        System.out.println("d for Wednesday");
        System.out.println("e for Thursday");
        System.out.println("f for Friday");
        System.out.println("Default for Saturday");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'a':
                System.out.println("Sunday");
                break;
            case 'b':
                System.out.println("Monday");
                break;
            case 'c':
                System.out.println("Tuesday");
                break;
            case 'd':
                System.out.println("Wednesday");
                break;
            case 'e':
                System.out.println("Thursday");
                break;
            case 'f':
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
                break;
        }

        scanner.close();
    }
}
