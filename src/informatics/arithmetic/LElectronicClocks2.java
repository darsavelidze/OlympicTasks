package informatics.arithmetic;

import java.util.Scanner;

public class LElectronicClocks2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = (n / 60 / 60) % 24;
        int m = (n / 60) % 60;
        int s = n % 60;
        String result = "";
        result += h + ":" + (m / 10) + (m % 10) + ":" + (s / 10) + (s % 10);
        System.out.println(result);
    }
}