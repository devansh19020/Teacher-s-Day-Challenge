/* Kefa decided to make some money doing business on the Internet for exactly n days. He knows that on the i-th day (1 ≤ i ≤ n) he makes ai money. Kefa loves progress, that's why he wants to know the length of the maximum non-decreasing subsegment in sequence ai. Let us remind you that the subsegment of the sequence is its continuous fragment. A subsegment of numbers is called non-decreasing if all numbers in it follow in the non-decreasing order.
Help Kefa cope with this task! */

import java.util.Scanner;

public class KefaFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int c = 0;
        int res = 0;
        int p = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x >= p) {
                c++;
                p = x;
            } else {
                res = Math.max(res, c);
                c = 1;
                p = x;
            }
        }
        System.out.println(Math.max(res, c));
    }
}
