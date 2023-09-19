/* Question 13. WAP to accept names and temperature of 10 cities and find the city which has the maximum temperature.
*/
import java.util.Scanner;

public class MaxTemperatureCity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cityNames = new String[10];
        double[] temperatures = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of city " + (i + 1) + ": ");
            cityNames[i] = scanner.nextLine();

            System.out.print("Enter temperature in Celsius for city " + cityNames[i] + ": ");
            temperatures[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        int maxIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (temperatures[i] > temperatures[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("City with maximum temperature:");
        System.out.println("City: " + cityNames[maxIndex]);
        System.out.println("Temperature: " + temperatures[maxIndex] + " Celsius");
    }
}

/* Question 14.WAP to accept marks of 10 students in computer application subject and display the name of the student who has got maximum marks.
*/
import java.util.Scanner;

public class MaxMarksStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentNames = new String[10];
        double[] marks = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter marks for student " + studentNames[i] + ": ");
            marks[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        int maxIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (marks[i] > marks[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Student with maximum marks:");
        System.out.println("Name: " + studentNames[maxIndex]);
        System.out.println("Marks: " + marks[maxIndex]);
    }
}

/* Question15.   Find the highest and smallest number of following array?

Int[] arr ={45,3,6,7,21,5,62,9};
*/
public class MinMaxArray {

    public static void main(String[] args) {
        int[] arr = {45, 3, 6, 7, 21, 5, 62, 9};
        
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Highest number: " + max);
    }
}

/* Question16.   WAP to remove duplicates from the following array?

Int[] arr ={2,3,4,5,2,3,3,2,4,5,4,5};
*/


class Main {

	static int removeDuplicates(int arr[], int n)
	{
		if (n == 0 || n == 1)
			return n;

		int[] temp = new int[n];

		int j = 0;
		for (int i = 0; i < n - 1; i++)
			
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];

		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++)
			arr[i] = temp[i];

		return j;
	}

	public static void main(String[] args)
	{
		Int[] arr ={2,3,4,5,2,3,3,2,4,5,4,5};
		int n = arr.length;

		n = removeDuplicates(arr, n);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}

/* Question 17. WAP to find number of occurrences from  the following array?

Int[] arr ={2,3,4,5,2,3,3,2,4,5,4,5};
*/
import java.util.HashMap;

public class CountOccurrences {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 3, 3, 2, 4, 5, 4, 5};

        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (int num : occurrences.keySet()) {
            System.out.println("Number: " + num + " Occurrences: " + occurrences.get(num));
        }
    }
}
