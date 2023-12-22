package DesignPatterns.AbstractFactoryPattern.Factory1;

public class OrdinaryFactory implements VehicleFactory {

    @Override
    public String getVehicleName(String vehicleType) {
        return "OrdinarySwift";
    }
}
