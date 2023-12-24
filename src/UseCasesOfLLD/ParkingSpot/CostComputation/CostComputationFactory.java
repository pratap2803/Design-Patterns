package UseCasesOfLLD.ParkingSpot.CostComputation;

import UseCasesOfLLD.ParkingSpot.Ticket.Ticket;

public class CostComputationFactory {
    public CostComputation getCostComputation(Ticket ticket){
        String vehiclType = ticket.getVehicle().getVehicleType();

            switch(vehiclType){
                case "TWO-WHEELER":
                    return new TwoWheelerCostComputation();
                case "FOUR-WHEELER":
                    return new FourWheelerCostComputation();
                default:
                    return null;
            }

    }
}
