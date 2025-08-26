/* Vanya walks late at night along a straight street of length l, lit by n lanterns. Consider the coordinate system with the beginning of the street corresponding to the point 0, and its end corresponding to the point l. Then the i-th lantern is at the point ai. The lantern lights all points of the street that are at the distance of at most d from it, where d is some positive number, common for all lanterns.
Vanya wonders: what is the minimum light radius d should the lanterns have to light the whole street? */

import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);
        double maxGap = 0;
        for (int i = 0; i < n - 1; i++) {
            maxGap = Math.max(maxGap, (double) (a[i + 1] - a[i]));
        }
        double d1 = maxGap / 2.0;
        double d2 = a[0];
        double d3 = l - a[n - 1];
        double minRadius = Math.max(d1, Math.max(d2, d3));
        System.out.printf("%.10f\n", minRadius);
        scanner.close();
    }
}
