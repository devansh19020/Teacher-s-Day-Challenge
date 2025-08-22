/* Anton likes to play chess, and so does his friend Danik.
Once they have played n games in a row. For each game it's known who was the winner — Anton or Danik. None of the games ended with a tie.
Now Anton wonders, who won more games, he or Danik? Help him determine this. */

import java.util.Scanner;

public class AntonDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int anton = 0, danik = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A') anton++;
            else if (c == 'D') danik++;
        }
        if (anton > danik) {
            System.out.println("Anton");
        } else if (danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
