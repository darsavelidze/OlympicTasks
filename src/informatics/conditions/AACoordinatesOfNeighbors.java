package informatics.conditions;

import java.util.Scanner;

public class AACoordinatesOfNeighbors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(), N = in.nextInt(), x = in.nextInt(), y = in.nextInt();
        if (y + 1 <= N) {
            System.out.println((x) + " " + (y + 1));
        }
        if (y - 1 > 0) {
            System.out.println((x) + " " + (y - 1));
        }
        if (x + 1 <= M) {
            System.out.println((x + 1) + " " + y);
        }
        if (x - 1 > 0) {
            System.out.println((x - 1) + " " + y);
        }
    }
}