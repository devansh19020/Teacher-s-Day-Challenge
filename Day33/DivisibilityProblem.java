/* You are given two positive integers a and b. In one move you can increase a by 1 (replace a with a + 1). Your task is to find the minimum number of moves you need to do in order to make a divisible by b. It is possible, that you have to make 0 moves, as a is already divisible by b. You have to answer t independent test cases. */

import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            if (a % b == 0) {
                System.out.println(0);
            } else {
                int remainder = a % b;
                int moves = b - remainder;
                System.out.println(moves);
            }
        }
        scanner.close();
    }
}
