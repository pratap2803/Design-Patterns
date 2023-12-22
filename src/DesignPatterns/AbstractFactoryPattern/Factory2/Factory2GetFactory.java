package DesignPatterns.AbstractFactoryPattern.Factory2;

import DesignPatterns.AbstractFactoryPattern.Factory1.LuxFactory;
import DesignPatterns.AbstractFactoryPattern.Factory1.OrdinaryFactory;
import DesignPatterns.AbstractFactoryPattern.Factory1.VehicleFactory;
import DesignPatterns.AbstractFactoryPattern.Vehicle.Vehicle;

public class Factory2GetFactory {
    VehicleFactory vehicleFactory;

    public Factory2GetFactory(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public VehicleFactory getVehFactory(Vehicle vehicle){
        switch (vehicle.vehicleName()){
            case "Mercedes":
                return new LuxFactory();
            case "Swift":
                return new OrdinaryFactory();
            default:
                return null;
        }
    }
}
