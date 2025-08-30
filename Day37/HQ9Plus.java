/* HQ9+ is a joke programming language which has only four one-character instructions:
"H" prints "Hello, World!",
"Q" prints the source code of the program itself,
"9" prints the lyrics of "99 Bottles of Beer" song,
"+" increments the value stored in the internal accumulator.
Instructions "H" and "Q" are case-sensitive and must be uppercase. The characters of the program which are not instructions are ignored.
You are given a program written in HQ9+. You have to figure out whether executing this program will produce any output. */

import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        if (input.contains("H") || input.contains("Q") || input.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
