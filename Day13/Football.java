/* Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of paper. To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is considered dangerous. For example, the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given the current situation. Determine whether it is dangerous or not. */

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cz = 0;
        int mz = 0;
        int mo = 0;
        int co = 0;
        for(char ch : str.toCharArray()) {
            if(ch == '0') {
                cz++;
                mz = Math.max(mz, cz);
                co = 0;
            } else{
                co++;
                mo = Math.max(mo, co);
                cz = 0;
            }
        }
        if(mz>=7 || mo >=7) System.out.println("YES");
        else System.out.println("NO");
    }
}
