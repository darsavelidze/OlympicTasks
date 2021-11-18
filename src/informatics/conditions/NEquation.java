package informatics.conditions;

import java.util.Scanner;

public class NEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a != 0 && b % a == 0) {
            System.out.println(-b / a);
        } else if (a != 0 && b == 0) {
            System.out.println(0);
        } else {
            System.out.println("NO");
        }
    }
}