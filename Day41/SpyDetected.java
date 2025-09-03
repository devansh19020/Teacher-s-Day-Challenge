/* You are given an array a consisting of n (n ≥ 3) positive integers. It is known that in this array, all the numbers except one are the same (for example, in the array [4, 11, 4, 4] all numbers except one are equal to 4).
Print the index of the element that does not equal others. The numbers in the array are numbered from one. */

import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int commonValue;
            if (a[0] == a[1]) {
                commonValue = a[0];
            } else {
                commonValue = a[2];
            }
            for (int i = 0; i < n; i++) {
                if (a[i] != commonValue) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        
        scanner.close();
    }
}
