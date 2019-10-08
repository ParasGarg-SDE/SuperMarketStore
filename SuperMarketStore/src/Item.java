import java.util.Scanner;

public class Item {

    private String itemName;
    private int itemQuantity;

    public Item(String itemName){
        this.itemName = itemName;
    }

    public int item_quantity(){
        System.out.println("Enter the Item Quantity : ");
        Scanner scanner = new Scanner(System.in);
        int item_quantity = scanner.nextInt();
        this.itemQuantity=item_quantity;
        return itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
