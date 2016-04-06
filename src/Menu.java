import java.util.*;


public class Menu extends InventoryItem {
    public static String getChoice() {
        return choice;
    }

    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String,Integer> inventoryList = new HashMap<>();
    public static String choice;

    public static void menu() {

        int i = 0;
        System.out.println("1. Add item to Inventory\n" +
                "2. Remove item from Inventory\n" +
                "3. Update an item's quantity\n" +
                "4. Leave Inventory");


        choice = scanner.nextLine();
        System.out.println(">" + choice + "<");

        switch (choice) {
            case ("1"): {
                System.out.println("Enter category: [Men/Woman/Headwear/Outerwear/Footwear]");
                String category = scanner.nextLine();

                System.out.println("1. What is the name of the item you would like to add?");
                String name = scanner.nextLine();
                Integer quantity = (++i);
                Inventory.createItem(name, quantity, category);


                break;
            }
            case ("2"): {
                System.out.println("2. Which item would you like to remove the Inventory?");
                String item = scanner.nextLine();
                int quantity = inventoryList.get(item) -1;

                inventoryList.put(item, quantity);
                System.out.println(item + " has been removed.");
                if (quantity >=0){
                    inventoryList.remove(item, quantity);
                    break;
                }
            }
            case ("3"): {
                System.out.println("3. Which item would you like to update quantity for?");
                String item = scanner.nextLine();
                int quantity = inventoryList.get(item) -1;

                System.out.println("Quantity for" + item + "has been updated to " + quantity);
                break;

            }
            case ("4"): {
                System.out.println("Thanks, have a good day");
                break;
            }
            default:
                System.out.println("Didn't mean to select Inventory? No problem, we can " +
                        "can close out for you");
                break;
        }
    }

}
