package UseCasesOfLLD.ParkingSpot.ParkingManagerSelection;

import UseCasesOfLLD.ParkingSpot.Manager.FourWheelerManager;
import UseCasesOfLLD.ParkingSpot.Manager.ParkingSPOTManager;
import UseCasesOfLLD.ParkingSpot.Manager.TwoWheelManager;
import UseCasesOfLLD.ParkingSpot.Vehicle.Vehicle;

public class ParkingManagerFactory {
    ParkingSPOTManager parkingSPOTManager;
    public static ParkingSPOTManager getParkingManager(Vehicle vehicle){
        switch (vehicle.getVehicleType()){
            case "TWO-WHEELER":
                return new TwoWheelManager();
            case "FOUR-WHEELER":
                return new FourWheelerManager();
            default:
                return null;
        }
    }
}
