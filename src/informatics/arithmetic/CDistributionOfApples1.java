package informatics.arithmetic;

import java.util.Scanner;

public class CDistributionOfApples1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        System.out.println(K / N);
    }
}