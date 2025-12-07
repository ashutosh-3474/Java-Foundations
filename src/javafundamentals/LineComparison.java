package javafundamentals;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        Scanner scanner = new Scanner(System.in);

        //input for line 1
        System.out.println("Enter Line 1 coordinates (x1 y1 x2 y2): ");
        double x1_1 = scanner.nextDouble();
        double y1_1 = scanner.nextDouble();
        double x2_1 = scanner.nextDouble();
        double y2_1 = scanner.nextDouble();

        //input for line 2
        System.out.println("Enter Line 2 coordinates (x1 y1 x2 y2): ");
        double x1_2 = scanner.nextDouble();
        double y1_2 = scanner.nextDouble();
        double x2_2 = scanner.nextDouble();
        double y2_2 = scanner.nextDouble();

        // Calculating lengths
        double line1Length = calculateLength(x1_1, y1_1, x2_1, y2_1);
        double line2Length = calculateLength(x1_2, y1_2, x2_2, y2_2);

        System.out.println("\nLength of Line 1 = " + line1Length);
        System.out.println("Length of Line 2 = " + line2Length);

        boolean equal = areLinesEqual(line1Length, line2Length);
        if(equal)
        {
            System.out.println("Both lines are equal");
        }
        else
        {
            System.out.println("Both lines are not equal");
        }
    }

    // UC1: calculate line length
    private static double calculateLength(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //UC2: equality check
    private static boolean areLinesEqual(double l1, double l2) {
        return Double.valueOf(l1).equals(Double.valueOf(l2));
    }
}
