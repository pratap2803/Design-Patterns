package UseCasesOfLLD.VehicleRentalSystem;

import java.util.List;
public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> stores, List<User> users){
        this.storeList = stores;
        this.userList = users;
    }

    public Store getStore(Location location){
        // based on your location, we will filter out the store from storeList.
        return storeList.get(0);
    }

    // add users
    // remove users
    // add store
    // remove store
}
