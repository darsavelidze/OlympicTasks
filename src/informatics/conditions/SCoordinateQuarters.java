package informatics.conditions;

import java.util.Scanner;

public class SCoordinateQuarters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
        if (x1 * x2 > 0 && y1 * y2 > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}