package UseCasesOfLLD.NullObjectDesignPattern;

public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle){
        if("Car".equals(typeOfVehicle)){
            return new Car();
        }else if("Bike".equals(typeOfVehicle)){
            return new Bike();
        }
        return new NullVehicle();
    }
}
