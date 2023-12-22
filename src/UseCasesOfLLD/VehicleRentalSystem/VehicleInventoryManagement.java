package UseCasesOfLLD.VehicleRentalSystem;

import UseCasesOfLLD.VehicleRentalSystem.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;
    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        //filter out some vehicles based on your choice
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }
}
