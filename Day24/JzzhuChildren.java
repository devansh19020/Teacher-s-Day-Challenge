/* There are n children in Jzzhu's school. Jzzhu is going to give some candies to them. Let's number all the children from 1 to n. The i-th child wants to get at least ai candies.
Jzzhu asks children to line up. Initially, the i-th child stands at the i-th place of the line. Then Jzzhu start distribution of the candies. He follows the algorithm:
Give m candies to the first child of the line.
If this child still haven't got enough candies, then the child goes to the end of the line, else the child go home.
Repeat the first two steps while the line is not empty.
Consider all the children in the order they go home. Jzzhu wants to know, which child will be the last in this order? */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JzzhuChildren {
    static class Pair {
        int ind;
        int val;
        Pair(int ind, int val) {
            this.ind = ind;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < n; i++) q.offer(new Pair(i, sc.nextInt()));
        while(q.size() > 1) {
            Pair p = q.poll();
            if(p.val > w) {
                p.val -= w;
                q.offer(p);
            }
        }
        System.out.println(q.isEmpty() ? -1 : q.poll().ind + 1);
        sc.close();
    }
}
