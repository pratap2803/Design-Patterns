package UseCasesOfLLD.ParkingSpot.Ticket;

import UseCasesOfLLD.ParkingSpot.Vehicle.Vehicle;
import UseCasesOfLLD.ParkingSpot.spot.ParkingSPOT;

public class Ticket {
    long entryTime;
    Vehicle vehicle;
    ParkingSPOT slot;

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSPOT getSlot() {
        return slot;
    }

    public void setSlot(ParkingSPOT slot) {
        this.slot = slot;
    }

    public Ticket(long entryTime, Vehicle vehicle, ParkingSPOT slot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.slot = slot;
    }
}
