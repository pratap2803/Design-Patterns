package DesignPatterns.TemplateMethodDesignPattern;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        // specific validation for paytofriend flow
        System.out.println("Validate logic of Pay to friedn");
    }

    @Override
    public void calculateFees() {
        // debit the amount
        System.out.println("debit the amount logic of pay to friend");
    }

    @Override
    public void debitAmount() {
        // specific free computation logic for pay to friend flow
        System.out.println("0% fees charged");
    }

    @Override
    public void creditAmount() {
        // credit the amount logic
        System.out.println("Credit the full amount");
    }
}
