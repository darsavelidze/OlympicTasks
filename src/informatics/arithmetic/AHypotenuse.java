package informatics.arithmetic;

import java.util.Scanner;

public class AHypotenuse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);
    }
}