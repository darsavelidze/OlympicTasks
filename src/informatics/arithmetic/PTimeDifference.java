package informatics.arithmetic;

import java.util.Scanner;

public class PTimeDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt(), m1 = in.nextInt(), s1 = in.nextInt(),
            h2= in.nextInt(), m2 = in.nextInt(), s2 = in.nextInt();
        int result = (h2 - h1) * 3600 + (m2 - m1) * 60 + (s2 - s1);
        System.out.println(result);
    }
}