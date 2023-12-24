package UseCasesOfLLD.ParkingSpot.CostComputation;

import UseCasesOfLLD.ParkingSpot.PricingStrategy.PricingStrategy;

public class CostComputation {
    PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    public long price(){
        return pricingStrategy.price(null, pricingStrategy);
    }
}
