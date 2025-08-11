/* By the military charter the soldiers should stand in the order of non-increasing of their height. But as there's virtually no time to do that, the soldiers lined up in the arbitrary order. However, the general is rather short-sighted and he thinks that the soldiers lined up correctly if the first soldier in the line has the maximum height and the last soldier has the minimum height. Please note that the way other solders are positioned does not matter, including the case when there are several soldiers whose height is maximum or minimum. Only the heights of the first and the last soldier are important.
For example, the general considers the sequence of heights (4, 3, 4, 2, 1, 1) correct and the sequence (4, 3, 1, 2, 2) wrong.
Within one second the colonel can swap any two neighboring soldiers. Help him count the minimum time needed to form a line-up which the general will consider correct. */

import java.util.Scanner;

public class ArrivalGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] == max) {
                max = i;
                break;
            }
        }
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] == min) {
                min = i;
                break;
            }
        }
        if(max < min) {
            System.out.println(max + n-1 - min);
        }
        else {
            System.out.println(max + n-1 - min - 1);
        }
        sc.close();
    }
}
