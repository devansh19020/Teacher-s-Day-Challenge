/* The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.
You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum. */

import java.util.ArrayList;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '+') continue;
            list.add(Character.getNumericValue(ch));
        }
        list.sort((a, b) -> a - b);
        for(int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i) + "+");
        }
        System.out.println(list.get(list.size()-1));
        sc.close();
    }
}
