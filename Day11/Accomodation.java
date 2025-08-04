/* George has recently entered the BSUCP (Berland State University for Cool Programmers). George has a friend Alex who has also entered the university. Now they are moving into a dormitory.
George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi ≤ qi). Your task is to count how many rooms has free place for both George and Alex. */

import java.util.Scanner;

public class Accomodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            if(sc.nextInt()-sc.nextInt() <=-2) res++;
        }
        System.out.println(res);
        sc.close();
    }
}
