import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area and perimeter:");
        System.out.println("Square");
        System.out.println("Rectangle");
        System.out.println("Circle");
        System.out.print("Shape Name: ");

        String shapeName = scanner.nextLine();

        if ("Square".equals(shapeName)) {
            System.out.print("Enter the side length of the square: ");
            double side = scanner.nextDouble();
            double squareArea = calculateSquareArea(side);
            double squarePerimeter = calculateSquarePerimeter(side);
            System.out.println("");
            System.out.println("");
            System.out.println("Shape: " + shapeName);
            System.out.println("");
            System.out.println("Properties: ");
            System.out.println("Side Length: " + side);
            System.out.println("");
            System.out.println("Square Area: " + squareArea);
            System.out.println("Square Perimeter: " + squarePerimeter);
        }

        else if ("Rectangle".equals(shapeName)) {
            System.out.print("Enter the length of the rectangle: ");
            double height = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double rectangleArea = calculateRectangleArea(height, width);
            double rectanglePerimeter = calculateRectanglePerimeter(height, width);
            System.out.println("");
            System.out.println("");
            System.out.println("Shape: " + shapeName);
            System.out.println("");
            System.out.println("Properties: ");
            System.out.println("height: " + height);
            System.out.println("width: " + width);
            System.out.println("");
            System.out.println("Rectangle Area: " + rectangleArea);
            System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
        }

        else if ("Circle".equals(shapeName)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double circleArea = calculateCircleArea(radius);
            double circleCircumference = calculateCircleCircumference(radius);
            System.out.println("");
            System.out.println("");
            System.out.println("Shape: " + shapeName);
            System.out.println("");
            System.out.println("Properties: ");
            System.out.println("Side Length: " + radius);
            System.out.println("");
            System.out.println("Circle Area: " + circleArea);
            System.out.println("Circle Circumference: " + circleCircumference);
        } else {
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
