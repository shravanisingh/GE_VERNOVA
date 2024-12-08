package src.DAY_2;

import java.util.Scanner;

public class LineComparisonProblem {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x1, y1):");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2, y2):");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        // Calculating length of the line
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("The length of the line is: %.2f units%n", length);

        sc.close();
    }
}
