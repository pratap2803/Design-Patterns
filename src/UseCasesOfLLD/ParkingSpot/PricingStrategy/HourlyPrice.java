package UseCasesOfLLD.ParkingSpot.PricingStrategy;

import UseCasesOfLLD.ParkingSpot.Ticket.Ticket;

import java.util.Date;

public class HourlyPrice extends PricingStrategy{
    @Override
    public long price(Ticket ticket, PricingStrategy pricingStrategy) {
        String vehiclType = ticket.getVehicle().getVehicleType();
        long entryTime = ticket.getEntryTime();
        long currTime = new Date().getTime();
        switch (vehiclType){
            case "TWO-WHEELER":
                return 20*(currTime - entryTime)/60;
            case "FOUR-WHEELER":
                return 40*(currTime - entryTime)/60;
            default:
                return 20;
        }
    }
}
