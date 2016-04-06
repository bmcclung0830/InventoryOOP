/**
 * Created by Brittany on 4/5/16.
 */
public class InventoryItem {
    public String name;
    public int itemQuantity;
    public String category;
    public int quantity;



    public InventoryItem(){

    }

        public void InventoryItem (String name, int quantity, String category){
            this.quantity = quantity;
            this.category = category;
        }
}
