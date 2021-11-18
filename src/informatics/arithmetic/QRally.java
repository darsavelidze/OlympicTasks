package informatics.arithmetic;

import java.util.Scanner;

public class QRally {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int result = (m + (n - m % n) % n) / n;
        System.out.println(result);
    }
}