/* An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point x(x > 0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house. */

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n/5;
        if (n % 5 != 0) {
            res++;
        }
        System.out.println(res);
        sc.close();
    }
}
