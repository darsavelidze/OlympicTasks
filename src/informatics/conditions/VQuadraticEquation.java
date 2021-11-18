package informatics.conditions;

import java.util.Scanner;

public class VQuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println((-b + Math.sqrt(d)) / (2 * a));
            System.out.println((-b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            System.out.println(-b / (2 * a));
        }
    }
}