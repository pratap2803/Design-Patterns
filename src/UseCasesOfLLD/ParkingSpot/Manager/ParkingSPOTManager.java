package UseCasesOfLLD.ParkingSpot.Manager;

import UseCasesOfLLD.ParkingSpot.ParkingManagerSelection.ParkingManagerFactory;
import UseCasesOfLLD.ParkingSpot.Strategy.ParkingStrategy;
import UseCasesOfLLD.ParkingSpot.spot.ParkingSPOT;

import java.util.List;

public class ParkingSPOTManager {
    List<ParkingSPOT> parkingSPOTList;
    ParkingStrategy parkingStrategy;
    public ParkingSPOTManager(){

    }

    public ParkingSPOTManager(List<ParkingSPOT> parkingSPOTList, ParkingStrategy parkingStrategy) {
        this.parkingSPOTList = parkingSPOTList;
        this.parkingStrategy = parkingStrategy;
    }

    public void findParkingSpace(List<ParkingSPOT> parkingSPOTList, ParkingStrategy parkingStrategy){
        System.out.println("Parking available");
    }
    public void addParkingSpace(){

    }
    public void removeParkingSpace(){

    }
    public void parkVehicle(){

    }
    public void removeVehicle(){

    }
}
