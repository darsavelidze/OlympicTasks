package informatics.conditions;

import java.util.Scanner;

public class RCutlets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), m = in.nextInt(), n = in.nextInt();
        if (k > n) {
            System.out.println(2 * m);
        } else {
            System.out.println(((2 * n + k - 1) / k) * m);
        }
    }
}