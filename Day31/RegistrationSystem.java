/* A new e-mail service "Berlandesk" is going to be opened in Berland in the near future. The site administration wants to launch their project as soon as possible, that's why they ask you to help. You're suggested to implement the prototype of site registration system. The system should work on the following principle.
Each time a new user wants to register, he sends to the system a request with his name. If such a name does not exist in the system database, it is inserted into the database, and the user gets the response OK, confirming the successful registration. If the name already exists in the system database, the system makes up a new user name, sends it to the user as a prompt and also inserts the prompt into the database. The new name is formed by the following rule. Numbers, starting with 1, are appended one after another to name (name1, name2, ...), among these numbers the least i is found so that namei does not yet exist in the database.
 */

import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        HashMap<String, Integer> database = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            if (!database.containsKey(name)) {
                System.out.println("OK");
                database.put(name, 0);
            } else {
                int count = database.get(name) + 1;
                String newName = name + count;
                while (database.containsKey(newName)) {
                    count++;
                    newName = name + count;
                }
                System.out.println(newName);
                database.put(name, count);
                database.put(newName, 0);
            }
        }
        scanner.close();
    }
}
