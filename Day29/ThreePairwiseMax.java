/* You are given three positive (i.e. strictly greater than zero) integers 𝑥, 𝑦 and 𝑧.
Your task is to find positive integers 𝑎, 𝑏 and 𝑐 such that 𝑥=max(𝑎,𝑏), 𝑦=max(𝑎,𝑐) and 𝑧=max(𝑏,𝑐), or determine that it is impossible to find such 𝑎, 𝑏 and 𝑐.
You have to answer 𝑡 independent test cases. Print required 𝑎, 𝑏 and 𝑐 in any (arbitrary) order. */



import java.util.Scanner;
import java.util.Arrays;

public class ThreePairwiseMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long[] nums = new long[3];
            nums[0] = scanner.nextLong();
            nums[1] = scanner.nextLong();
            nums[2] = scanner.nextLong();

            Arrays.sort(nums);

            if (nums[1] != nums[2]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(nums[0] + " " + nums[0] + " " + nums[2]);
            }
        }
    }
}