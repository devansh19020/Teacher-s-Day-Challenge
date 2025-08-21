/* Petya loves lucky numbers. We all know that lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
Petya wonders eagerly what minimum lucky number has the sum of digits equal to n. Help him cope with the task. */

import java.util.Scanner;

public class LuckySumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minLength = Integer.MAX_VALUE;
        int bestX = -1, bestY = -1;

        for (int y = 0; y <= n / 7; y++) {
            int rem = n - 7 * y;
            if (rem < 0) break;
            if (rem % 4 == 0) {
                int x = rem / 4;
                int length = x + y;
                if (length < minLength) {
                    minLength = length;
                    bestX = x;
                    bestY = y;
                } else if (length == minLength && x < bestX) {
                    bestX = x;
                    bestY = y;
                }
            }
        }

        if (bestX == -1) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bestX; i++) sb.append('4');
            for (int i = 0; i < bestY; i++) sb.append('7');
            System.out.println(sb.toString());
        }
    }
}
