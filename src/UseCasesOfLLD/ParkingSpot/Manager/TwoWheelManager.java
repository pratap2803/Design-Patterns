package UseCasesOfLLD.ParkingSpot.Manager;

import UseCasesOfLLD.ParkingSpot.Strategy.ParkingStrategy;
import UseCasesOfLLD.ParkingSpot.spot.ParkingSPOT;

import java.util.List;

public class TwoWheelManager extends ParkingSPOTManager{
    public TwoWheelManager() {
        super();
    }

    public TwoWheelManager(List<ParkingSPOT> parkingSPOTList, ParkingStrategy strategy) {
        super(parkingSPOTList, strategy);
    }

    @Override
    public void findParkingSpace(List<ParkingSPOT> parkingSPOTList, ParkingStrategy parkingStrategy) {
        super.findParkingSpace(parkingSPOTList, parkingStrategy);
    }

    @Override
    public void addParkingSpace() {
        super.addParkingSpace();
    }

    @Override
    public void removeParkingSpace() {
        super.removeParkingSpace();
    }

    @Override
    public void parkVehicle() {
        super.parkVehicle();
    }

    @Override
    public void removeVehicle() {
        super.removeVehicle();
    }

}
