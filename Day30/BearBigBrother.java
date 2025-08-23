/* Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.
Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.
Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.
After how many full years will Limak become strictly larger (strictly heavier) than Bob? */

import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int years = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }

        System.out.println(years);
    }
}
