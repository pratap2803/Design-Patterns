package UseCasesOfLLD.InventoryManagementSystem;

import java.util.Map;

public class Warehouse {
    Inventory inventory;
    Address address;

    // update inventory
    public void removeItemInventory(Map<Integer, Integer> productCategoryAndCountMap){
        // it will update the items in the inventory based upon product category.
        inventory.removeItems(productCategoryAndCountMap);
    }
    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap){
        // it will update the items in the inventory based upon product category.
    }
}
