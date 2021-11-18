package informatics.arithmetic;

import java.util.Scanner;

public class JNextEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nextN = n - n % 2 + 2;
        System.out.println(nextN);
    }
}