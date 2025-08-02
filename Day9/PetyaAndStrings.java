/* Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison. */

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean isEqual = true;
        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(1);
                isEqual = false;
                break;
            } 
            else if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(-1);
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println(0);
        }
    }
}
