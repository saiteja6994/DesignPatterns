package StrategyDesignPattern;

public class Payment implements PaymentStrategy{

    private PaymentStrategy paymentStrategy;
    public Payment(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    @Override
    public void makePayment() {
        paymentStrategy.makePayment();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
}
