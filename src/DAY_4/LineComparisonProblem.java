package src.DAY_4;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation!");

        // Input for Line 1
        System.out.println("Enter coordinates for Line 1:");
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));

        // Input for Line 2
        System.out.println("Enter coordinates for Line 2:");
        System.out.print("Enter x1: ");
        double p1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double q1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double p2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double q2 = sc.nextDouble();

        Line line2 = new Line(new Point(p1, q1), new Point(p2, q2));

        // Display lengths
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Length of Line 2: " + line2.getLength());

        // Compare Lines
        int comparison = line1.compareTo(line2);
        if (comparison == 0) {
            System.out.println("The lines are equal.");
        } else if (comparison > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 1 is less than Line 2.");
        }

        // Check Equality
        if (line1.equals(line2)) {
            System.out.println("Line 1 is equal to Line 2.");
        } else {
            System.out.println("Line 1 is not equal to Line 2.");
        }

        sc.close();
    }
}
