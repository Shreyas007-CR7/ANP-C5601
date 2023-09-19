public class Perimeter {
    public double calculatePerimeter(double side) {
        return 4 * side;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculatePerimeter(double radius, boolean isCircle) {
        if (isCircle) {
            return 2 * (22.0 / 7) * radius;
        } else {
            return 0; // Invalid option
        }
    }

    public static void main(String[] args) {
        Perimeter perimeterCalculator = new Perimeter();

        double squareSide = 5.0;
        double rectangleLength = 8.0;
        double rectangleWidth = 6.0;
        double circleRadius = 3.0;

        double squarePerimeter = perimeterCalculator.calculatePerimeter(squareSide);
        double rectanglePerimeter = perimeterCalculator.calculatePerimeter(rectangleLength, rectangleWidth);
        double circlePerimeter = perimeterCalculator.calculatePerimeter(circleRadius, true);

        System.out.println("Perimeter of Square: " + squarePerimeter);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);
        System.out.println("Perimeter of Circle: " + circlePerimeter);
    }
}
