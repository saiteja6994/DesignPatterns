package StrategyDesignPattern;

public class CreditCardPayemnt implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("Paying with credit card");
    }
}
