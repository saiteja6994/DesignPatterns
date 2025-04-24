package StrategyDesignPattern;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("Payment with Paypal");
    }
}
