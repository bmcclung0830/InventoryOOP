import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;


public class Menu {
    public static String getChoice() {
        return choice;
    }


    public static Scanner scanner = new Scanner(System.in);
    public static Scanner intScanner = new Scanner(System.in);
    public static HashMap<String,InventoryItem> inventoryList = new HashMap<>();
    public static String choice;
    public static InventoryItem item;


    public static void menu() {


        inventoryList.put("Hat", new Headwear("Hat", 1));
        inventoryList.put("Coat", new Outerwear("Coat", 1));
        inventoryList.put("Dress", new Women("Dress", 1));
        inventoryList.put("Shoes", new Footwear("Shoes", 1));
        inventoryList.put("Pants", new Men("Pants", 1));


        System.out.println("1. Add item to Inventory\n" +
                "2. Remove item from Inventory\n" +
                "3. Update an item's quantity\n" +
                "4. View Inventory\n" +
                "5. Leave Inventory");

        choice = scanner.nextLine();
        System.out.println(">" + choice + "<");


        switch (choice) {
            case ("1"): {
                Menu.addItem();
                break;
            }
            case ("2"): {
                Menu.remItem();
                break;
            }
            case ("3"): {
                Menu.updateItem();
                break;
            }
            case ("4"): {
                Menu.viewItem();
                break;
            }
            case ("5"): {
                Menu.leaveMenu();
                break;
            }
            default:
                System.out.println("That is not an option");
        }
    }


    public static void addItem() {
        System.out.printf("Enter category: [Mens/Womens/Headwear/Outerwear/Footwear]");
        String category = scanner.nextLine();
        System.out.println("What is the name of the item you would like to add?");
        String name = scanner.nextLine();
        System.out.println("Please enter the quantity for this new item");
        int quantity = intScanner.nextInt();
        inventoryList.put(name, Inventory.createItem(category, name, quantity));
        System.out.println("Great, we added your new item as follows: \n" + "Category: " +
                category + "\n" + "Item name: " + name + "\n" + "Quantity: " + quantity);
    }

    public static void remItem() {
        System.out.println("2. Which item would you like to remove from the Inventory?");

        Iterator<Map.Entry<String, InventoryItem>> iterator = inventoryList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, InventoryItem> entry = iterator.next();
            System.out.println(entry.getValue());
        }
        String item = scanner.nextLine();
        if (inventoryList.containsKey(item)) {
            inventoryList.remove(item);
            System.out.println(item + " has been removed.");
        } else {
            System.out.println("This item does not exist in your Inventory");
        }
    }

    public static void updateItem() {
        System.out.println("3. What is the item that you want to update?");
        Iterator<Map.Entry<String, InventoryItem>> iterator = inventoryList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, InventoryItem> entry = iterator.next();
            System.out.println(entry.getValue());
        }
        String itemName = scanner.nextLine();
        if (inventoryList.containsKey(itemName)) {
            item = inventoryList.get(itemName);
            System.out.println("What is the new quantity for " + itemName);
            int quantity = intScanner.nextInt();
            item.setQuantity(quantity);
            System.out.println(item);
            inventoryList.replace(itemName, item);
            System.out.println(inventoryList);
            System.out.println("Quantity for " + itemName + " has been updated to " + quantity);
        } else {
            System.out.println("This item does not exist in your Inventory");
        }
    }

    public static void viewItem() {
        System.out.println(inventoryList);
    }

    public static void leaveMenu() {
        System.out.println("Thanks, have a good day");
    }

}
