/* Kyoya Ootori is selling photobooks of the Ouran High School Host Club. He has 26 photos, labeled "a" to "z", and he has compiled them into a photo booklet with some photos in some order (possibly with some photos being duplicated). A photo booklet can be described as a string of lowercase letters, consisting of the photos in the booklet in order. He now wants to sell some "special edition" photobooks, each with one extra photo inserted anywhere in the book. He wants to make as many distinct photobooks as possible, so he can make more money. He asks Haruhi, how many distinct photobooks can he make by inserting one extra photo into the photobook he already has? */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Photobooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String newStr = s.substring(0, i) + c + s.substring(i);
                set.add(newStr);
            }
        }
        System.out.println(set.size());
    }
}
