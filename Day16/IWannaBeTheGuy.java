/* There is a game called "I Wanna Be the Guy", consisting of n levels. Little X and his friend Little Y are addicted to the game. Each of them wants to pass the whole game.
Little X can pass only p levels of the game. And Little Y can pass only q levels of the game. You are given the indices of levels Little X can pass and the indices of levels Little Y can pass. Will Little X and Little Y pass the whole game, if they cooperate each other? */

import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        boolean flag = true;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }
        for(int i = 1; i <= n; i++) {
            if (!set.contains(i)) flag = false;
        }
        if (flag) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
