package informatics.arithmetic;

import java.util.Scanner;

public class UCheckDivisibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int result = (n % m) * (m % n) + 1;
        System.out.println(result);
    }
}