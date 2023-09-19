/* Question 9.WAP to insert 7 integer values in an array and store even/odd numbers in different two arrays.
*/
public class EvenOddSeparation {

    public static void main(String[] args) {
        int[] originalArray = {12, 5, 8, 21, 14, 7, 9};
        int[] evenArray = new int[7]; 
        int[] oddArray = new int[7]; 
		
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] % 2 == 0) {
                evenArray[evenCount] = originalArray[i];
                evenCount++;
            } else {
                oddArray[oddCount] = originalArray[i];
                oddCount++;
            }
        }

      
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}

/* Question 10. WAP to insert 10 integer values and count all prime numbers and its values.
*/
public class CountPrimeNumbers {

    public static void main(String[] args) {
        int[] array = {12, 5, 8, 21, 14, 7, 9, 19, 23, 15};
        
        int primeCount = 0;

        System.out.println("Prime numbers:");

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
                primeCount++;
            }
        }

        System.out.println("\nTotal prime numbers: " + primeCount);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

/* Question 11.WAP to accept and categorize 20 employees in the age group of 22-30, 31-40, 41-50, 51-60
*/
import java.util.Scanner;

public class EmployeeAgeCategorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ageArray = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter age for employee " + (i + 1) + ": ");
            ageArray[i] = scanner.nextInt();
        }

        int count22to30 = 0;
        int count31to40 = 0;
        int count41to50 = 0;
        int count51to60 = 0;

        for (int i = 0; i < 20; i++) {
            if (ageArray[i] >= 22 && ageArray[i] <= 30) {
                count22to30++;
            } else if (ageArray[i] >= 31 && ageArray[i] <= 40) {
                count31to40++;
            } else if (ageArray[i] >= 41 && ageArray[i] <= 50) {
                count41to50++;
            } else if (ageArray[i] >= 51 && ageArray[i] <= 60) {
                count51to60++;
            }
        }

        System.out.println("Employees in age group 22-30: " + count22to30);
        System.out.println("Employees in age group 31-40: " + count31to40);
        System.out.println("Employees in age group 41-50: " + count41to50);
        System.out.println("Employees in age group 51-60: " + count51to60);
    }
}

/* Question 12.WAP to accept salary of 20 employees and find out people who are earning more than rupees 50000 per month
*/
import java.util.Scanner;

public class HighSalaryEmployees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaryArray = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaryArray[i] = scanner.nextDouble();
        }

        System.out.println("Employees earning more than 50000 per month:");

        for (int i = 0; i < 20; i++) {
            if (salaryArray[i] > 50000) {
                System.out.println("Employee " + (i + 1) + ": Salary " + salaryArray[i]);
            }
        }
    }
}
