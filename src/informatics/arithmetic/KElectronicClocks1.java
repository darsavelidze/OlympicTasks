package informatics.arithmetic;

import java.util.Scanner;

public class KElectronicClocks1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = (n / 60) % 24;
        int m = (n % 60);
        System.out.println(h + " " + m);
    }
}