import java.util.Scanner;

public class BuyItemUtils {

    private int reQuiredItemQuantity;

    public int getBuyItem(){
        System.out.println("Enter the Required Item Quantity : ");
        Scanner scanner = new Scanner(System.in);
        int reQuiredItemQuantity = scanner.nextInt();
        this.reQuiredItemQuantity=reQuiredItemQuantity;
        return reQuiredItemQuantity;
    }

    public int getReQuiredItemQuantity() {
        return reQuiredItemQuantity;
    }

    public void setReQuiredItemQuantity(int reQuiredItemQuantity) {
        this.reQuiredItemQuantity = reQuiredItemQuantity;
    }
}
