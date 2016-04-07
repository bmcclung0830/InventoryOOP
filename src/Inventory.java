import java.util.InputMismatchException;

public class Inventory {

    public static void main(String[] args) {


        while (true) {
            Login.login();
            Menu.menu();
            while (! Menu.getChoice().equalsIgnoreCase("5")) {
                Menu.menu();
            }
        }
    }


    static InventoryItem createItem(String category, String name,int quantity) {

        switch (category) {
            case "Womens": return new Women(name, quantity);
            case "Mens": return new Men(name, quantity);
            case "Outerwear": return new Outerwear(name, quantity);
            case "Footwear": return new Footwear (name, quantity);
            case "Headwear": return new Headwear(name, quantity);
            default: return new InventoryItem();
        }
    }

}
