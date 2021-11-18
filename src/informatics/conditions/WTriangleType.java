package informatics.conditions;

import java.util.Scanner;

public class WTriangleType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int min, max, mid;
        max = Math.max(Math.max(a, b), c);
        min = Math.min(Math.min(a, b), c);
        mid = a + b + c - max - min;
        if (a < b + c && b < a + c && c < a + b) {
            if (max * max > mid * mid + min * min) {
                System.out.println("obtuse");
            } else if (max * max == mid * mid + min * min) {
                System.out.println("right");
            } else {
                System.out.println("acute");
            }
        } else {
            System.out.println("impossible");
        }
    }
}