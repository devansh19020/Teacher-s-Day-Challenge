/* Valera is a lazy student. He has m clean bowls and k clean plates.
Valera has made an eating plan for the next n days. As Valera is lazy, he will eat exactly one dish per day. At that, in order to eat a dish, he needs exactly one clean plate or bowl. We know that Valera can cook only two types of dishes. He can eat dishes of the first type from bowls and dishes of the second type from either bowls or plates.
When Valera finishes eating, he leaves a dirty plate/bowl behind. His life philosophy doesn't let him eat from dirty kitchenware. So sometimes he needs to wash his plate/bowl before eating. Find the minimum number of times Valera will need to wash a plate/bowl, if he acts optimally. */

import java.util.Scanner;

public class ValeraPlates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(sc.nextInt() == 2 && k>0) k--;
            else m--;
        }
        if (m < 0) {
            System.out.println(Math.abs(m));
        }
        else {
            System.out.println(0);
        }
        sc.close();
    }
}
