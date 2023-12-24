package UseCasesOfLLD.ParkingSpot.spot;

import DesignPatterns.StrategyPattern.Vehicle;

public class TwoWheelerSPOT extends ParkingSPOT {

    public int price(){
        return 10;
    }
    @Override
    public void parkVehicle(Vehicle vehicle) {

    }

    @Override
    public void RemoveVehicle() {

    }
}
