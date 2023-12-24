package UseCasesOfLLD.ParkingSpot.PricingStrategy;

import UseCasesOfLLD.ParkingSpot.Ticket.Ticket;

import java.util.Date;

public class MinutePrice extends PricingStrategy{
    @Override
    public long price(Ticket ticket, PricingStrategy pricingStrategy) {
        String vehiclType = ticket.getVehicle().getVehicleType();
        long entryTime = ticket.getEntryTime();
        long currTime = new Date().getTime();
        switch (vehiclType){
            case "TWO-WHEELER":
                return 10*(currTime - entryTime)/60;
            case "FOUR-WHEELER":
                return 20*(currTime - entryTime)/60;
            default:
                return 10;
        }
    }
}
