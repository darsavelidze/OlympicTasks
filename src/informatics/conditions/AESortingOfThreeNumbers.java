package informatics.conditions;

import java.util.Scanner;

public class AESortingOfThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int max = Math.max(Math.max(a, b), c), min = Math.min(Math.min(a, b), c), mid = a + b + c - max - min;
        System.out.println(min + " " + mid + " " + max);
    }
}