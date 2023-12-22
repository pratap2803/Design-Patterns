package DesignPatterns.AbstractFactoryPattern.Factory1;

public class LuxFactory implements VehicleFactory {

    @Override
    public String getVehicleName(String vehicleType) {
        return "LuxuryMecedes";
    }
}
