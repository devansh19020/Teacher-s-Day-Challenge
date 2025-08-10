/* Ann has recently started commuting by subway. We know that a one ride subway ticket costs a rubles. Besides, Ann found out that she can buy a special ticket for m rides (she can buy it several times). It costs b rubles. Ann did the math; she will need to use subway n times. Help Ann, tell her what is the minimum sum of money she will have to spend to make n rides? */

import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(m*a < b){
            System.out.println(n*a);
        }
        else{
            int ans = Math.min( (n/m)*b + (n%m)*a, (n/m)*b + b);
            System.out.println(ans);    
        }
    }
}
