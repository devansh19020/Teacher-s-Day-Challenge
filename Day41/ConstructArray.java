/* You are given an array 𝑎 of length 𝑛 consisting of zeros. You perform 𝑛 actions with this array: during the 𝑖-th action, the following sequence of operations appears:
Choose the maximum by length subarray (continuous subsegment) consisting only of zeros, among all such segments choose the leftmost one;
Let this segment be [𝑙;𝑟]. If 𝑟−𝑙+1 is odd (not divisible by 2) then assign (set) 𝑎[𝑙+𝑟2]:=𝑖
 (where 𝑖 is the number of the current action), otherwise (if 𝑟−𝑙+1
 is even) assign (set) 𝑎[𝑙+𝑟−12]:=𝑖. */

import java.util.PriorityQueue;
import java.util.Scanner;

public class ConstructArray {
    static class ZeroSegment implements Comparable<ZeroSegment> {
        int start;
        int end;
        int length;

        public ZeroSegment(int start, int end) {
            this.start = start;
            this.end = end;
            this.length = end - start + 1;
        }

        @Override
        public int compareTo(ZeroSegment other) {
            if (this.length != other.length) {
                return Integer.compare(other.length, this.length);
            }
            return Integer.compare(this.start, other.start);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        PriorityQueue<ZeroSegment> pq = new PriorityQueue<>();
        pq.add(new ZeroSegment(0, n - 1));
        for (int i = 1; i <= n; i++) {
            ZeroSegment segment = pq.poll();
            int l = segment.start;
            int r = segment.end;
            int mid;
            if (segment.length % 2 != 0) {
                mid = (l + r) / 2;
            } else {
                mid = (l + r - 1) / 2;
            }
            a[mid] = i;
            if (l <= mid - 1) {
                pq.add(new ZeroSegment(l, mid - 1));
            }
            if (mid + 1 <= r) {
                pq.add(new ZeroSegment(mid + 1, r));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
    }
}
