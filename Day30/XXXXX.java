/* Ehab loves number theory, but for some reason he hates the number 𝑥. Given an array 𝑎, find the length of its longest subarray such that the sum of its elements isn't divisible by 𝑥, or determine that such subarray doesn't exist.

An array 𝑎 is a subarray of an array 𝑏 if 𝑎 can be obtained from 𝑏 by deletion of several (possibly, zero or all) elements from the beginning and several (possibly, zero or all) elements from the end. */

import java.util.Scanner;

public class XXXXX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            long totalSum = 0;
            int firstNonMultipleIdx = -1;
            int lastNonMultipleIdx = -1;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                totalSum += a[i];
                if (a[i] % x != 0) {
                    if (firstNonMultipleIdx == -1) {
                        firstNonMultipleIdx = i;
                    }
                    lastNonMultipleIdx = i;
                }
            }

            if (totalSum % x != 0) {
                System.out.println(n);
            } else {
                if (firstNonMultipleIdx == -1) {
                    System.out.println(-1);
                } else {
                    int len1 = n - (firstNonMultipleIdx + 1);
                    int len2 = lastNonMultipleIdx;
                    System.out.println(Math.max(len1, len2));
                }
            }
        }
    }
}
