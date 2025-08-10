/* Sereja and Dima play a game. The rules of the game are very simple. The players have n cards in a row. Each card contains a number, all numbers on the cards are distinct. The players take turns, Sereja moves first. During his turn a player can take one card: either the leftmost card in a row, or the rightmost one. The game ends when there is no more cards. The player who has the maximum sum of numbers on his cards by the end of the game, wins.
Sereja and Dima are being greedy. Each of them chooses the card with the larger number during his move.
Inna is a friend of Sereja and Dima. She knows which strategy the guys are using, so she wants to determine the final score, given the initial state of the game. Help her.*/

import java.util.Scanner;

public class SerenaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0, r = n - 1;
        int p1 = 0, p2 = 0;
        while(l <= r) {
            if(arr[l] < arr[r]) {
                p1 += arr[r];
                r--;
            } else {
                p1 += arr[l];
                l++;
            }
            if(l <= r) {
                if(arr[l] < arr[r]) {
                    p2 += arr[r];
                    r--;
                } else {
                    p2 += arr[l];
                    l++;
                }
            }
        }
        System.out.println(p1 + " " + p2);
        sc.close();
    }
}
