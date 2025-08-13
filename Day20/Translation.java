/* The translation from the Berland language into the Birland language is not an easy task. Those languages are very similar: a Berlandish word differs from a Birlandish word with the same meaning a little: it is spelled (and pronounced) reversely. For example, a Berlandish word code corresponds to a Birlandish word edoc. However, making a mistake during the "translation" is easy. Vasya translated the word s from Berlandish into Birlandish as t. Help him: find out if he translated the word correctly. */

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        } 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(t.length() - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
