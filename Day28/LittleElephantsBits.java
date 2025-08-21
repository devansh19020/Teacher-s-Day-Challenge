/* The Little Elephant has an integer a, written in the binary notation. He wants to write this number on a piece of paper.
To make sure that the number a fits on the piece of paper, the Little Elephant ought to delete exactly one any digit from number a in the binary record. At that a new number appears. It consists of the remaining binary digits, written in the corresponding order (possible, with leading zeroes).
The Little Elephant wants the number he is going to write on the paper to be as large as possible. Help him find the maximum number that he can obtain after deleting exactly one binary digit and print it in the binary notation. */

import java.util.Scanner;

public class LittleElephantsBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = s.indexOf("0");
        if(i==-1) System.out.println(s.substring(1));
        else System.out.println(s.substring(0, i) + s.substring(i+1));
    }
}
