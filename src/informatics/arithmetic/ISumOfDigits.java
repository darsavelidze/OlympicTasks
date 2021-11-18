package informatics.arithmetic;

import java.util.Scanner;

public class ISumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = n / 100 + (n % 100) / 10 + n % 10;
        System.out.println(sum);
    }
}