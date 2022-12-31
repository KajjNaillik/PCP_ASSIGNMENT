import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import calcul.Calculator2D;
import calcul.Calculator3D;
import calcul.Objectform;

public class VolumeCalculator {
    private static Scanner userInput;
    private static String userMessage;
    static Calculator3D calculator3D;
    static Calculator2D calculator2D;

    private static Map<String, Objectform> initMap() {
        Map<String, Objectform> map = new HashMap<>();
        map.put("Cy", Objectform.CYLINDER);
        map.put("Sp", Objectform.SPHERE);
        map.put("Cu", Objectform.CUBOID);
        map.put("Co", Objectform.CONE);
        map.put("R", Objectform.RECTANGLE);
        map.put("Sq", Objectform.SQUARE);
        map.put("T", Objectform.TRIANGLE);
        map.put("C", Objectform.CIRCLE);
        return Collections.unmodifiableMap(map);
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static void main(String[] arg) {
        userInput = new Scanner(System.in);

        print("Do you want to calcul a 2D or 3D object ? (3D/2D): ");
        userMessage = "";
        while (!userMessage.equals("3D") && !userMessage.equals("2D")) {
            userMessage = userInput.nextLine();
        }
        if (userMessage.equals("3D")) { // Choose the object if it's 3D
            userMessage = "";
            print("Which object you want to calcul ?\nCylinder (Cy)\nSphere (Sp)\nCuboid (Cu)\nCone (Co)");
            // Repeat until the object selected is valid
            while (!userMessage.equals("Cy") && !userMessage.equals("Sp") && !userMessage.equals("Cu")
                    && !userMessage.equals("Co")) {
                userMessage = userInput.nextLine();
            }
            calculator3D = new Calculator3D(initMap().get(userMessage));
        } else { // Choose the object if it's 2D
            userMessage = "";
            print("Which object you want to calcul ?\nRectangles (R)\nSquares (Sq)\nTriangles (T)\nCircles (C)");
            // Repeat until the object selected is valid
            while (!userMessage.equals("R") && !userMessage.equals("Sq") && !userMessage.equals("T")
                    && !userMessage.equals("C")) {
                userMessage = userInput.nextLine();
            }
            calculator2D = new Calculator2D(initMap().get(userMessage));
        }
    }
}
