package informatics.conditions;

import java.util.Scanner;

public class ODifficultEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0 || b * c == a * d) {
            System.out.println("NO");
        } else if (b % a == 0) {
            System.out.println(-b / a);
        } else {
            System.out.println("NO");
        }
    }
}