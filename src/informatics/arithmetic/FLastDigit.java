package informatics.arithmetic;

import java.util.Scanner;

public class FLastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n % 10);
    }
}