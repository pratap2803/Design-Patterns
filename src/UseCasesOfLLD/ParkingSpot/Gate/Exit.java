package UseCasesOfLLD.ParkingSpot.Gate;

import UseCasesOfLLD.ParkingSpot.CostComputation.CostComputation;
import UseCasesOfLLD.ParkingSpot.CostComputation.CostComputationFactory;
import UseCasesOfLLD.ParkingSpot.Manager.ParkingSPOTManager;
import UseCasesOfLLD.ParkingSpot.Ticket.Ticket;

public class Exit {
    Ticket ticket;
    CostComputationFactory costComputationFactory;
    ParkingSPOTManager parkingSPOTManager;
    public void priceCalculation(){
       CostComputation costComputation =  costComputationFactory.getCostComputation(ticket);
       costComputation.price();
    }
    // payment methods like UPI, DEBIT, CREDIT, CASH
    // remove vehicle and freeup space
}
