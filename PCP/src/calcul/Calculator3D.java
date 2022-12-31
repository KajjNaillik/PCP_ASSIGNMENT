package calcul;

import java.util.Scanner;

public class Calculator3D {

    public static Scanner scanner = new Scanner(System.in);

    private static void Cylinder() {
        System.out.println("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder is: " + volume);
    };

    private static void Sphere() {
        System.out.println("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("The volume of the sphere is: " + volume);
    };

    private static void Cuboid() {
        System.out.println("Enter the length of the cuboid:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the cuboid:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the cuboid:");
        double height = scanner.nextDouble();
        double volume = length * width * height;
        System.out.println("The volume of the cuboid is: " + volume);
    };

    private static void Cone() {
        System.out.println("Enter the radius of the cone:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height of the cone:");
        double height = scanner.nextDouble();
        double volume = (Math.PI * radius * radius * height) / 3;
        System.out.println("The volume of the cone is: " + volume);
    };

    public Calculator3D(Objectform objectType) {
        switch (objectType) {
            case CYLINDER:
                Cylinder();
                break;
            case SPHERE:
                Sphere();
                break;
            case CUBOID:
                Cuboid();
                break;
            case CONE:
                Cone();
                break;
            default:
                break;
        }
    }

}
