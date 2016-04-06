import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Brittany on 4/5/16.
 */
public class Login {
    String userID;
    String password;

    public static HashMap<String, String> users = new HashMap<>();
    public static Scanner userScanner = new Scanner(System.in);

    public static void login() {

        users.put("Brittany", "britski");
        users.put("John", "johnski");
        users.put("Derrick", "derrski");
        users.put("Tristan", "tritski");
        users.put("Rob", "robski");


        System.out.println("Please enter your user name:");
        String userID = userScanner.nextLine();


        if (! users.containsKey(userID)){
            System.out.println("Looks like you aren't in our system, lets get you added. \n" +
                    " Please enter your desired userID below: ");
            userID = userScanner.nextLine();
            if (users.containsKey(userID)){
                if (users.containsKey(userID));{
                    System.out.println("Looks like you must have mistyped your userID, let's try that again.");
                    users.get(userID);
                    System.out.println("Please enter your password");
                    String password = userScanner.nextLine();

                    if (! users.containsValue(password)) {
                        while (!users.containsValue(password)) {
                            System.out.println("Looks like you entered your password incorrectly, " +
                                    "let's try again. Please enter your password");
                            password = userScanner.nextLine();
                            break;
                        }
                    }
                }
            }

        }
        else {
            System.out.println("Please enter your password");
            String password = userScanner.nextLine();
            if (! users.containsValue(password)) {
                while (! users.containsValue(password)) {
                    System.out.println("Looks like you entered your password incorrectly, " +
                            "let's try again. Please enter your password");
                    password = userScanner.nextLine();
                }
            }
        }
    }

}
