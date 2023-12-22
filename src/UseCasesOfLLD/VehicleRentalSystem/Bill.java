package UseCasesOfLLD.VehicleRentalSystem;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    @Override
    public String toString() {
        return "Bill{" +
                "reservation=" + reservation +
                ", totalBillAmount=" + totalBillAmount +
                ", isBillPaid=" + isBillPaid +
                '}';
    }

    public Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount() {
        return 100;
    }
}
