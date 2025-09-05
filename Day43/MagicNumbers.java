/* A magic number is a number formed by concatenation of numbers 1, 14 and 144. We can use each of these numbers any number of times. Therefore 14144, 141414 and 1411 are magic numbers but 1444, 514 and 414 are not.
You're given a number. Determine if it is a magic number or not. */

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        
        if (n.matches("(1|14|144)*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}