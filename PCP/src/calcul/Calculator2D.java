package calcul;

import java.util.Scanner;

public class Calculator2D {

    public static Scanner scanner = new Scanner(System.in);

    public static void Rectangles() {
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    };

    public static void Squares() {
        System.out.println("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        double area = sideLength * sideLength;
        System.out.println("The area of the square is: " + area);
    };

    public static void Triangles() {
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    };

    public static void Circles() {
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    };

    public Calculator2D(Objectform objectType) {
        switch (objectType) {
            case RECTANGLE:
                Rectangles();
                break;
            case SQUARE:
                Squares();
                break;
            case TRIANGLE:
                Triangles();
                break;
            case CIRCLE:
                Circles();
                break;
            default:
                break;
        }
    }
}
