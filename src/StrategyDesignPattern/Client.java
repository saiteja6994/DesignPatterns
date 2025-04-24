package StrategyDesignPattern;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayemnt=new CreditCardPayemnt();
        PaymentStrategy paypal=new PaypalPayment();

        Payment processor=new Payment(creditCardPayemnt);
        processor.makePayment();

        Payment processor2=new Payment(paypal);
        processor2.setPaymentStrategy(creditCardPayemnt);

        processor2.makePayment();

    }
}
