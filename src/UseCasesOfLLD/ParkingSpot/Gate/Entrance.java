package UseCasesOfLLD.ParkingSpot.Gate;

import UseCasesOfLLD.ParkingSpot.Manager.ParkingSPOTManager;
import UseCasesOfLLD.ParkingSpot.ParkingManagerSelection.ParkingManagerFactory;
import UseCasesOfLLD.ParkingSpot.Ticket.Ticket;
import UseCasesOfLLD.ParkingSpot.Vehicle.Vehicle;

public class Entrance {
    Vehicle vehicle = new Vehicle(2638, "TWO-WHEELER");
    Ticket ticket;
    public ParkingSPOTManager getParkingSPOTManager() {
        ParkingSPOTManager parkingSPOTManager = ParkingManagerFactory.getParkingManager(vehicle);
        return parkingSPOTManager;
    }
    // find nearest spot available for parking
    //findSpace(vehicleType, entrancegateno)
    //parkingspot = Bookspot(vehicle)
    //generateTicket(vehicle, parkingspot)
}
