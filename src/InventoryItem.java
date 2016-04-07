/**
 * Created by Brittany on 4/5/16.
 */
public class InventoryItem {
    public String name;
    public String category;
    public int quantity;

    @Override
    public String toString() {
        return String.format("%s, %s, %s", category, name, quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public InventoryItem(){

    }


        public void InventoryItem (String name, int quantity, String category){
            this.quantity = quantity;
            this.category = category;
        }
}
