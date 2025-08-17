/* Xenia the mathematician has a sequence consisting of n (n is divisible by 3) positive integers, each of them is at most 7. She wants to split the sequence into groups of three so that for each group of three a, b, c the following conditions held:
a < b < c;
a divides b, b divides c.
Naturally, Xenia wants each element of the sequence to belong to exactly one group of three. Thus, if the required partition exists, then it has  groups of three.
Help Xenia, find the required partition or else say that it doesn't exist. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeniaDivisors {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[8];  
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            cnt[x]++;
        }
        List<String> result = new ArrayList<>();

        if (cnt[5] > 0 || cnt[7] > 0) {
            System.out.println(-1);
            return;
        }

        int t124 = Math.min(cnt[1], Math.min(cnt[2], cnt[4]));
        for (int i = 0; i < t124; i++) {
            result.add("1 2 4");
        }
        cnt[1] -= t124; cnt[2] -= t124; cnt[4] -= t124;

        int t126 = Math.min(cnt[1], Math.min(cnt[2], cnt[6]));
        for (int i = 0; i < t126; i++) {
            result.add("1 2 6");
        }
        cnt[1] -= t126; cnt[2] -= t126; cnt[6] -= t126;

        int t136 = Math.min(cnt[1], Math.min(cnt[3], cnt[6]));
        for (int i = 0; i < t136; i++) {
            result.add("1 3 6");
        }
        cnt[1] -= t136; cnt[3] -= t136; cnt[6] -= t136;

        if (cnt[1] != 0 || cnt[2] != 0 || cnt[3] != 0 || cnt[4] != 0 || cnt[6] != 0) {
            System.out.println(-1);
            return;
        }
        
        for (String g : result) {
            System.out.println(g);
        }
    }
}