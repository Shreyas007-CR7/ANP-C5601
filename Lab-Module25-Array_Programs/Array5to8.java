/* Question 5.WAP to insert 6 different integer values in 1D array and find the largest value and smallest values in array using any kind of sorting.
*/
import java.util.Arrays;

public class ArrayMinMax {

    public static void main(String[] args) {
        int[] array = {45, 12, 78, 23, 9, 56};
        
        Arrays.sort(array)
        
        int smallest = array[0];
        int largest = array[array.length - 1];

        System.out.println("Sorted Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
   
        System.out.println("Smallest Value: " + smallest);
        System.out.println("Largest Value: " + largest);
    }
}

/* Question 6.WAP to count the even and odd number between 9 elements of an array.
*/
public class CountEvenOdd {

    public static void main(String[] args) {
        int[] array = {12, 5, 8, 21, 14, 7, 9, 16, 3};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}

/* Question 7.WAP to find a particular number entered by user and match this number with five elements of an array. If number is found then print “found” otherwise print
“Not found”.
*/
import java.util.Scanner;

public class SearchNumber {

    public static void main(String[] args) {
        int[] array = {12, 5, 8, 21, 14};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int targetNumber = scanner.nextInt();
        
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found.");
        }
    }
}

/* Question 8.In program no. 7, if number is found then replace that number by another number.
*/
import java.util.Scanner;

public class ReplaceNumber {

    public static void main(String[] args) {
        int[] array = {12, 5, 8, 21, 14};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search and replace: ");
        int targetNumber = scanner.nextInt();
        
        System.out.print("Enter the replacement number: ");
        int replacementNumber = scanner.nextInt();
        
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetNumber) {
                array[i] = replacementNumber;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found and replaced!");
            System.out.println("Updated array:");
            for (int value : array) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Number not found.");
        }
    }
}
