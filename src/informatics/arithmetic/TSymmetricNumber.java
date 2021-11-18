package informatics.arithmetic;

import java.util.Scanner;

public class TSymmetricNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), left, right;
        left = n / 100;
        right = (n % 10) * 10 + (n % 100) / 10;
        int result = left - right + 1;
        System.out.println(result);
    }
}