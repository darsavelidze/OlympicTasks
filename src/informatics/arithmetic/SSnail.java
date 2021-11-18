package informatics.arithmetic;

import java.util.Scanner;

public class SSnail {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        int result = (h - b - 1) / (a - b) + 1;
        System.out.println(result);
    }
}