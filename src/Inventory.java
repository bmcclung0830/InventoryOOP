public class Inventory {

    public static void main(String[] args) {


        while (true) {
            Login.login();
            Menu.menu();
            while (! Menu.getChoice().equalsIgnoreCase("4")) {
                Menu.menu();
            }

        }
    }


    static InventoryItem createItem(String name, int quantity, String category) {

        switch (category) {
            case "Woman": Menu.inventoryList.put(name, quantity);
            case "Men": Menu.inventoryList.put(name, quantity);
            case "Outerwear": Menu.inventoryList.put(name, quantity);
            case "Headwear": Menu.inventoryList.put(name, quantity);
            case "Footwear": Menu.inventoryList.put(name, quantity);
            default: return new InventoryItem();
        }
    }

}
