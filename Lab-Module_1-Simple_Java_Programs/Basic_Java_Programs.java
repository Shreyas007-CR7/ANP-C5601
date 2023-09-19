/*
Question 1.WAP to swap two integer values using third variable.
*/
import java.util.Scanner;

public class \ {
    public static void main(String[] args) {
        int num1, num2, temp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        scanner.close();

        // Swapping using a temporary variable
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
/*
Question 2. WAP to swap two integer values without using third variable.
*/
import java.util.Scanner;

public class SwapIntegersWithoutTemp {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        scanner.close();

        // Swapping without using a temporary variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}

/*
Question 3.  WAP to convert temperature degree centigrade to degree Fahrenheit.
*/
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        scanner.close();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in degrees Fahrenheit: " + fahrenheit);
    }
}

/*
Question 4.  WAP to calculate area and perimeter of circle, square, and rectangle.
*/

import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                double circlePerimeter = 2 * Math.PI * radius;
                System.out.println("Circle Area: " + circleArea);
                System.out.println("Circle Perimeter: " + circlePerimeter);
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                double squarePerimeter = 4 * side;
                System.out.println("Square Area: " + squareArea);
                System.out.println("Square Perimeter: " + squarePerimeter);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                double rectanglePerimeter = 2 * (length + width);
                System.out.println("Rectangle Area: " + rectangleArea);
                System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}

/*
Question 5.  WAP to check the entered year is “Leap year” or “not Leap year”.
*/
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
/*
Question 6. WAP to calculate the total salary of an employee, where the basic salary of employee is 10,000 and TA is 10%,DA is 20% and HRA is 30% of basic salary.
*/
public class SalaryCalculator {
    public static void main(String[] args) {
        double basicSalary = 10000;
        double taPercentage = 0.10;  // TA is 10% of basic salary
        double daPercentage = 0.20;  // DA is 20% of basic salary
        double hraPercentage = 0.30; // HRA is 30% of basic salary

        // Calculate allowances and deductions
        double ta = basicSalary * taPercentage;
        double da = basicSalary * daPercentage;
        double hra = basicSalary * hraPercentage;

        // Calculate total salary
        double totalSalary = basicSalary + ta + da + hra;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("TA: " + ta);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Total Salary: " + totalSalary);
    }
}
