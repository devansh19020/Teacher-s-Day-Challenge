/* Despite his bad reputation, Captain Flint is a friendly person (at least, friendly to animals). Now Captain Flint is searching worthy sailors to join his new crew (solely for peaceful purposes). A sailor is considered as worthy if he can solve Flint's task.
Recently, out of blue Captain Flint has been interested in math and even defined a new class of integers. Let's define a positive integer 𝑥 as nearly prime if it can be represented as 𝑝⋅𝑞, where 1<𝑝<𝑞 and 𝑝 and 𝑞 are prime numbers. For example, integers 6 and 10 are nearly primes (since 2⋅3=6 and 2⋅5=10), but integers 1, 3, 4
, 16, 17 or 44 are not.
Captain Flint guessed an integer 𝑛 and asked you: can you represent it as the sum of 4 different positive integers where at least 3 of them should be nearly prime.
Uncle Bogdan easily solved the task and joined the crew. Can you do the same? */

import java.util.Scanner;

public class CaptainFlint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            if (n <= 30) {
                System.out.println("NO");
            } else if (n == 36) {
                System.out.println("YES");
                System.out.println("5 6 10 15");
            } else if (n == 40) {
                System.out.println("YES");
                System.out.println("6 9 10 15");
            } else if (n == 44) {
                System.out.println("YES");
                System.out.println("6 10 13 15");
            } else {
                System.out.println("YES");
                System.out.println("6 10 14 " + (n - 30));
            }
        }
    }
}

