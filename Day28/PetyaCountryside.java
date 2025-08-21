/* Little Petya often travels to his grandmother in the countryside. The grandmother has a large garden, which can be represented as a rectangle 1 × n in size, when viewed from above. This rectangle is divided into n equal square sections. The garden is very unusual as each of the square sections possesses its own fixed height and due to the newest irrigation system we can create artificial rain above each section.
Creating artificial rain is an expensive operation. That's why we limit ourselves to creating the artificial rain only above one section. At that, the water from each watered section will flow into its neighbouring sections if their height does not exceed the height of the section. That is, for example, the garden can be represented by a 1 × 5 rectangle, where the section heights are equal to 4, 2, 3, 3, 2. Then if we create an artificial rain over any of the sections with the height of 3, the water will flow over all the sections, except the ones with the height of 4. */

import java.util.Scanner;

public class PetyaCountryside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            int cur = 1;
            int cHeight = heights[i];
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] <= cHeight) {
                    cur++;
                    cHeight = heights[j];
                } else {
                    break;
                }
            }
            cHeight = heights[i];
            for (int j = i + 1; j < n; j++) {
                if (heights[j] <= cHeight) {
                    cur++;
                    cHeight = heights[j];
                } else {
                    break;
                }
            }
            mx = Math.max(mx, cur);
        }
        System.out.println(mx);
    }
}