package Day28;

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        
        if (n.matches("(1|14|144)*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}