package Day35;

import java.util.Scanner;

public class PanoramixPrediction {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int nextPrime = n + 1;
        while (true) {
            if (isPrime(nextPrime)) {
                break;
            }
            nextPrime++;
        }
        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
