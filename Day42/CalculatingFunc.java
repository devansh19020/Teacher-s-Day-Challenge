/* For a positive integer n let's define a function f:
f(n) =  - 1 + 2 - 3 + .. + (( - 1)^n)n
Your task is to calculate f(n) for a given integer n. */

import java.util.Scanner;

public class CalculatingFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        long result;
        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -(n + 1) / 2;
        }
        System.out.println(result);
    }
}
