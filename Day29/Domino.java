/* Valera has got n domino pieces in a row. Each piece consists of two halves — the upper one and the lower one. Each of the halves contains a number from 1 to 6. Valera loves even integers very much, so he wants the sum of the numbers on the upper halves and the sum of the numbers on the lower halves to be even.
To do that, Valera can rotate the dominoes by 180 degrees. After the rotation the upper and the lower halves swap places. This action takes one second. Help Valera find out the minimum time he must spend rotating dominoes to make his wish come true. */

import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        int topSum = 0;
        int bottomSum = 0;
        int oddEvenCount = 0;

        for (int i = 0; i < n; i++) {
            top[i] = scanner.nextInt();
            bottom[i] = scanner.nextInt();
            topSum += top[i];
            bottomSum += bottom[i];
            if ((top[i] % 2) != (bottom[i] % 2)) {
                oddEvenCount++;
            }
        }

        if (topSum % 2 == 0 && bottomSum % 2 == 0) {
            System.out.println(0);
        } else if (topSum % 2 != 0 && bottomSum % 2 != 0) {
            if (oddEvenCount > 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }
    }
}
