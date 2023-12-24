package UseCasesOfLLD.ParkingSpot.CostComputation;

import UseCasesOfLLD.ParkingSpot.PricingStrategy.MinutePrice;
import UseCasesOfLLD.ParkingSpot.PricingStrategy.PricingStrategy;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation() {
        super(new MinutePrice());
    }
}
