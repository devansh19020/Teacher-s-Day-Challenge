/* Pashmak decided to give Parmida a pair of flowers from the garden. There are n flowers in the garden and the i-th of them has a beauty number bi. Parmida is a very strange girl so she doesn't want to have the two most beautiful flowers necessarily. She wants to have those pairs of flowers that their beauty difference is maximal possible!
Your task is to write a program which calculates two things:
The maximum beauty difference of flowers that Pashmak can give to Parmida.
The number of ways that Pashmak can pick the flowers. Two ways are considered different if and only if there is at least one flower that is chosen in the first way and not chosen in the second way.
 */

import java.util.Arrays;
import java.util.Scanner;

public class PashmakFlower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);
        long maxDiff = b[n - 1] - b[0];
        long count = 0;
        if (maxDiff == 0) {
            count = (long) n * (n - 1) / 2;
        } else {
            long minCount = 0;
            for (int i = 0; i < n; i++) {
                if (b[i] == b[0]) {
                    minCount++;
                } else {
                    break;
                }
            }
            long maxCount = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (b[i] == b[n - 1]) {
                    maxCount++;
                } else {
                    break;
                }
            }
            count = minCount * maxCount;
        }
        System.out.println(maxDiff + " " + count);
    }
}
