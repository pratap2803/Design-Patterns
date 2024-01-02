package UseCasesOfLLD.InventoryManagementSystem;

import java.util.List;

public class NearestWarehouseSelectionStrategy extends WarehouseSelectionStrategy {
    @Override
    public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
        // algo to pick the nearest warehouse, for now I am picking the first warehouse for demo purpose
        return warehouseList.get(0);
    }
}
