/* We know that prime numbers are positive integers that have exactly two distinct positive divisors. Similarly, we'll call a positive integer t Т-prime, if t has exactly three distinct positive divisors.
You are given an array of n positive integers. For each of them determine whether it is Т-prime or not. */

import java.util.Arrays;
import java.util.Scanner;

public class TPrimes {
    public static void main(String[] args) {
        int MAX_SQRT_X = 1000001;
        
        boolean[] isPrime = new boolean[MAX_SQRT_X];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p * p < MAX_SQRT_X; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < MAX_SQRT_X; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long x = scanner.nextLong();
            long sqrtX = (long) Math.sqrt(x);
            if (sqrtX * sqrtX == x) {
                if (isPrime[(int) sqrtX]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
