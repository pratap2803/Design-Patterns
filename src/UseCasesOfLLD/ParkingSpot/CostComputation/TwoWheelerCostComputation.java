package UseCasesOfLLD.ParkingSpot.CostComputation;

import UseCasesOfLLD.ParkingSpot.PricingStrategy.HourlyPrice;
import UseCasesOfLLD.ParkingSpot.PricingStrategy.PricingStrategy;

public class TwoWheelerCostComputation extends CostComputation{
    public TwoWheelerCostComputation() {
        super(new HourlyPrice());
    }
}
