package DesignPatterns.TemplateMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentToMerchant = new PaymentToMerchant();
        paymentToMerchant.sendMoney();

        PaymentFlow paymentToFriend = new PayToFriend();
        paymentToFriend.sendMoney();
    }
}
