package DesignPatterns.TemplateMethodDesignPattern;

public class PaymentToMerchant extends PaymentFlow{

    @Override
    public void validateRequest() {
        // specific validation for Pay to merchant flow
        System.out.println("validate logic of pay to merchant flow");
    }

    @Override
    public void calculateFees() {
        // debit the amount
        System.out.println("debit the amount logic of pay to merchant");
    }

    @Override
    public void debitAmount() {
        // specific fee computation logic for pay to merchant flow
        System.out.println("2% fees charged");
    }

    @Override
    public void creditAmount() {
        // credit the amount logic
        System.out.println("credit the remaining amount");
    }
}
