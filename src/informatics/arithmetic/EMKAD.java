package informatics.arithmetic;

import java.util.Scanner;

public class EMKAD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int t = in.nextInt();
        System.out.println((109 + (v * t) % 109) % 109);
    }
}