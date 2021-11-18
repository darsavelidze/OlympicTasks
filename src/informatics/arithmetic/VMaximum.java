package informatics.arithmetic;

import java.util.Scanner;

public class VMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), result;
        result = (a * (a / b) + b * (b / a))/ (a / b + b / a);
        System.out.println(result);
    }
}