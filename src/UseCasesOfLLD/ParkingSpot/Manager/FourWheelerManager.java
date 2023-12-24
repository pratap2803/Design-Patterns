package UseCasesOfLLD.ParkingSpot.Manager;

import UseCasesOfLLD.ParkingSpot.Strategy.ParkingStrategy;
import UseCasesOfLLD.ParkingSpot.spot.ParkingSPOT;

import java.util.List;

public class FourWheelerManager extends ParkingSPOTManager{
    public FourWheelerManager() {
        super();
    }

    public FourWheelerManager(List<ParkingSPOT> parkingSPOTList, ParkingStrategy strategy) {
        super(parkingSPOTList, strategy);
    }
}
