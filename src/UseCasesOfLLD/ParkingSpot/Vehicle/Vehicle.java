package UseCasesOfLLD.ParkingSpot.Vehicle;

public class Vehicle {
    int vehicleNumber;
    String vehicleType;

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle(int vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
//    enum vehicleType {
//        TWOWHEELER,
//        FOURWHEELER
//    }
}
