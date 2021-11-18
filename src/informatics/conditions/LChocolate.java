package informatics.conditions;

import java.util.Scanner;

public class LChocolate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
        if (n == 1 && m == n || n * m == k || k == 0 || k > n * m) {
            System.out.println("NO");
        } else if (k % n == 0 || k % m == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}