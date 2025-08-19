/* The Berland State University is hosting a ballroom dance in celebration of its 100500-th anniversary! n boys and m girls are already busy rehearsing waltz, minuet, polonaise and quadrille moves.
We know that several boy&girl pairs are going to be invited to the ball. However, the partners' dancing skill in each pair must differ by at most one.
For each boy, we know his dancing skills. Similarly, for each girl we know her dancing skills. Write a code that can determine the largest possible number of pairs that can be formed from n boys and m girls. */

import java.util.Arrays;
import java.util.Scanner;

public class BerSUBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int m = sc.nextInt();
        int[] g = new int[m];
        for (int i = 0; i < m; i++) {
            g[i] = sc.nextInt();
        }
        Arrays.sort(g);
        int i = 0, j = 0;
        int res = 0;
        while (i < n && j < m) {
            if (Math.abs(b[i] - g[j]) < 2) {
                j++;
                res++;
                i++;
            } 
            else if (b[i] < g[j]) {
                i++;
            } 
            else{
                j++;
            }
        }
        System.out.println(res);
    }
}
