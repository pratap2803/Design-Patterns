package UseCasesOfLLD.InventoryManagementSystem;



public class Payment {
    PaymentMode paymentMode;

    Payment(PaymentMode paymentMode){
        this.paymentMode = paymentMode;
    }

    public Payment(UseCasesOfLLD.VehicleRentalSystem.PaymentMode paymentMode) {
    }

    public boolean makePayment(){
        return paymentMode.makePayment();
    }
}
