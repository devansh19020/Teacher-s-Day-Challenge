/* During the break the schoolchildren, boys and girls, formed a queue of n people in the canteen. Initially the children stood in the order they entered the canteen. However, after a while the boys started feeling awkward for standing in front of the girls in the queue and they started letting the girls move forward each second.
Let's describe the process more precisely. Let's say that the positions in the queue are sequentially numbered by integers from 1 to n, at that the person in the position number 1 is served first. Then, if at time x a boy stands on the i-th position and a girl stands on the (i + 1)-th position, then at time x + 1 the i-th position will have a girl and the (i + 1)-th position will have a boy. The time is given in seconds.
You've got the initial position of the children, at the initial moment of time. Determine the way the queue is going to look after t seconds. */

import java.util.Scanner;

public class SchoolQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        char[] arr = str.toCharArray();
        while (t-- > 0) {
            int i = 0;
            while(i<n-1) {
                if(arr[i] == 'B' && arr[i+1] == 'G'){
                    arr[i] = 'G';
                    arr[i+1] = 'B';
                    i++; 
                }
                i++;
            }
        }
        System.out.println(new String(arr));
    }
}
