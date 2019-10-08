import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static BuyItemUtils buyItemUtils;

    static Map<String, Item> StoreToItemEntryMap = new HashMap<>();
    static Map<String, Item> StoreToItemMap = new HashMap<>();


    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String command;
        while (!(command=scanner.next()).equalsIgnoreCase("quit")){
            processCommand(command);
        }
    }

    private static void processCommand(String command){
        if (command.startsWith("in_")){
            String item_name=command.replace("in_","");
            StoreToItemEntryMap.put(item_name,null);

            Item item = StoreToItemMap.get(item_name);
            if (item==null){
                item = new Item(item_name);
                item.item_quantity();
                StoreToItemMap.put(item_name,item);
            }
        }

        else if (command.startsWith("search_")) {
            String item_name = command.replace("search_", "");
            Item ItemName = StoreToItemMap.get(item_name);



            if (ItemName == null) {
                System.out.println("No Such Item Found");
            } else {
                    System.out.println("Item Name : " + item_name);
                    System.out.println(" Item Quantity : " + ItemName.getItemQuantity());
            }
        }

        else if (command.startsWith("buy_")){
            String item_name = command.replace("buy_","");
            Item ItemName = StoreToItemMap.get(item_name);

            if (ItemName == null) {
                System.out.println("No Such Item Found to Buy");
            } else {
                buyItemUtils = new BuyItemUtils();
                int quantity=buyItemUtils.getBuyItem();

                Item item = StoreToItemMap.get(item_name);
                int remainingQuantity = item.getItemQuantity() - quantity;
                item.setItemQuantity(remainingQuantity);

                StoreToItemMap.put(item_name, item);
            }
        }

        else if (command.startsWith("record")) {
            for (Map.Entry<String, Item> stringItemEntry : StoreToItemMap.entrySet()) {
                String ItemName = stringItemEntry.getKey();
                Item itemQuantity = stringItemEntry.getValue();
                System.out.println("Item Name : " + ItemName + " with Quantity : " + itemQuantity.getItemQuantity());
            }
        }
    }
}