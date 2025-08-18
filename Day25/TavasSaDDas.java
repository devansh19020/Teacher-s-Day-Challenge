/* You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
If we sort all lucky numbers in increasing order, what's the 1-based index of n? */

import java.util.Scanner;

public class TavasSaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int L = n.length();
        int base = (1 << L) - 2; 
        int binVal = 0;
        for (int i = 0; i < L; i++) {
            binVal <<= 1;
            if (n.charAt(i) == '7') {
                binVal |= 1;
            }
        }
        int result = base + binVal + 1;
        System.out.println(result);
    }
}
