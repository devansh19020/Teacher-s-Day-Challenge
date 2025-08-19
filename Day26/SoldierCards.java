/* Two bored soldiers are playing card war. Their card deck consists of exactly n cards, numbered from 1 to n, all values are different. They divide cards between them in some manner, it's possible that they have different number of cards. Then they play a "war"-like card game.
The rules are following. On each turn a fight happens. Each of them picks card from the top of his stack and puts on the table. The one whose card value is bigger wins this fight and takes both cards from the table to the bottom of his stack. More precisely, he first takes his opponent's card and puts to the bottom of his stack, and then he puts his card to the bottom of his stack. If after some turn one of the player's stack becomes empty, he loses and the other one wins.
You have to calculate how many fights will happen and who will win the game, or state that game won't end. */

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class SoldierCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k1 = sc.nextInt();
        Deque<Integer> p1 = new LinkedList<>();
        for (int i = 0; i < k1; i++) {
            p1.add(sc.nextInt());
        }
        int k2 = sc.nextInt();
        Deque<Integer> p2 = new LinkedList<>();
        for (int i = 0; i < k2; i++) {
            p2.add(sc.nextInt());
        }
        Set<String> seen = new HashSet<>();
        int fights = 0;
        
        while (!p1.isEmpty() && !p2.isEmpty()) {
            String state = p1.toString() + "|" + p2.toString();
            if (seen.contains(state)) {
                System.out.println(-1);
                return;
            }
            seen.add(state);

            fights++;

            int card1 = p1.poll();
            int card2 = p2.poll();

            if (card1 > card2) {
                p1.add(card2);
                p1.add(card1);
            } else {
                p2.add(card1);
                p2.add(card2);
            }
        }
        if (p1.isEmpty()) {
            System.out.println(fights + " " + 2);
        } else {
            System.out.println(fights + " " + 1);
        }
    }
}
