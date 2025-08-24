/* Allen has a LOT of money. He has 𝑛
 dollars in the bank. For security reasons, he wants to withdraw it in cash (we will not disclose the reasons here). The denominations for dollar bills are 1, 5, 10, 20, 100. What is the minimum number of bills Allen could receive after withdrawing his entire balance? */

import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int[] denominations = {100, 20, 10, 5, 1};

        for (int i = 0; i < denominations.length; i++) {
            count += n / denominations[i];
            n %= denominations[i];
        }

        System.out.println(count);
        scanner.close();
    }
}
