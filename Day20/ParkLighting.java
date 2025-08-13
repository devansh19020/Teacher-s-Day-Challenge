/* Due to the coronavirus pandemic, city authorities obligated citizens to keep a social distance. The mayor of the city Semyon wants to light up Gluharniki park so that people could see each other even at night to keep the social distance.
The park is a rectangular table with 𝑛 rows and 𝑚 columns, where the cells of the table are squares, and the boundaries between the cells are streets. External borders are also streets. Every street has length 1. For example, park with 𝑛=𝑚=2
has 12 streets.
You were assigned to develop a plan for lighting the park. You can put lanterns in the middle of the streets. The lamp lights two squares near it (or only one square if it stands on the border of the park).
Semyon wants to spend the least possible amount of money on lighting but also wants people throughout the park to keep a social distance. So he asks you to find the minimum number of lanterns that are required to light all the squares.
*/

import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println((m*n)/2 + (m*n)%2);
        }
    }
}
  

