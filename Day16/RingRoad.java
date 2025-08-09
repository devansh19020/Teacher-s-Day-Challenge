/* Xenia lives in a city that has n houses built along the main ringroad. The ringroad houses are numbered 1 through n in the clockwise order. The ringroad traffic is one way and also is clockwise.
Xenia has recently moved into the ringroad house number 1. As a result, she's got m things to do. In order to complete the i-th task, she needs to be in the house number ai and complete all tasks with numbers less than i. Initially, Xenia is in the house number 1, find the minimum time she needs to complete all her tasks if moving from a house to a neighboring one along the ringroad takes one unit of time.
 */

import java.util.Scanner;

public class RingRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        long total = 0;
        int current = 1;
        for (int i = 0; i < m; i++) {
            if (a[i] >= current) {
                total += a[i] - current;
            } else {
                total += n - (current - a[i]);
            }
            current = a[i];
        }
        System.out.println(total);
    }
}
