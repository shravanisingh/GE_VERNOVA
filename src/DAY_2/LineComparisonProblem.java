package src.DAY_2;

import java.util.Scanner;

public class LineComparisonProblem {
    private static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter point 1 for line 1:");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter point 2 for line 1:");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Enter point 1 for line 2:");
        System.out.print("p1: ");
        double p1 = sc.nextDouble();
        System.out.print("q1: ");
        double q1 = sc.nextDouble();

        System.out.println("Enter point 2 for line 2:");
        System.out.print("p2: ");
        double p2 = sc.nextDouble();
        System.out.print("q2: ");
        double q2 = sc.nextDouble();

        Double len1 = calculateLength(x1, y1, x2, y2);
        Double len2 = calculateLength(p1, q1, p2, q2);

        System.out.println("Length of Line 1: " + len1);
        System.out.println("Length of Line 2: " + len2);

        int comparison = len1.compareTo(len2);
        if (comparison == 0) {
            System.out.println("The lines are equal.");
        } else if (comparison > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 1 is less than Line 2.");
        }

        sc.close();
    }
}