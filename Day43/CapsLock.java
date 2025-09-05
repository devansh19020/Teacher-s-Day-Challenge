/* wHAT DO WE NEED cAPS LOCK FOR?
Caps lock is a computer keyboard key. Pressing it sets an input mode in which typed letters are capital by default. If it is pressed by accident, it leads to accidents like the one we had in the first passage.
Let's consider that a word has been typed with the Caps lock key accidentally switched on, if:
either it only contains uppercase letters;
or all letters except for the first one are uppercase.
In this case we should automatically change the case of all letters. For example, the case of the letters that form words "hELLO", "HTTP", "z" should be changed.
Write a program that applies the rule mentioned above. If the rule cannot be applied, the program should leave the word unchanged. */

import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        boolean shouldChangeCase = true;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                shouldChangeCase = false;
                break;
            }
        }

        if (shouldChangeCase) {
            StringBuilder result = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            }
            System.out.println(result.toString());
        } else {
            System.out.println(s);
        }
    }
}
