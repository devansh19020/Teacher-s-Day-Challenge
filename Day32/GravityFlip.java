/* Little Chris is bored during his physics lessons (too easy), so he has built a toy box to keep himself occupied. The box is special, since it has the ability to change gravity.
There are n columns of toy cubes in the box arranged in a line. The i-th column contains ai cubes. At first, the gravity in the box is pulling the cubes downwards. When Chris switches the gravity, it begins to pull all the cubes to the right side of the box. The figure shows the initial and final configurations of the cubes in the box: the cubes that have changed their position are highlighted with orange. */

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] columns = new int[n];
        for (int i = 0; i < n; i++) {
            columns[i] = scanner.nextInt();
        }
        Arrays.sort(columns);
        for (int i = 0; i < n; i++) {
            System.out.print(columns[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        scanner.close();
    }
}
