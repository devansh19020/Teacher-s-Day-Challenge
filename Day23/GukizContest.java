/* Professor GukiZ likes programming contests. He especially likes to rate his students on the contests he prepares. Now, he has decided to prepare a new contest.
In total, n students will attend, and before the start, every one of them has some positive integer rating. Students are indexed from 1 to n. Let's denote the rating of i-th student as ai. After the contest ends, every student will end up with some positive integer position. GukiZ expects that his students will take places according to their ratings.
He thinks that each student will take place equal to 1 + (number of students with a higher rating). In particular, if student A has rating strictly lower then student B, A will get the strictly better position than B, and if two students have equal ratings, they will share the same position.
GukiZ would like you to reconstruct the results by following his expectations. Help him and determine the position after the end of the contest for each of his students if everything goes as expected. */

import java.util.Scanner;

public class GukizContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] rank = new int[n];
        
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] > a[i]) cnt++;
            }
            rank[i] = cnt + 1;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
