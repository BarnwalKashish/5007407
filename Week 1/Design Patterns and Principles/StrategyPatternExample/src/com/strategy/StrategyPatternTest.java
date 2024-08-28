// StrategyPatternTest.java
package com.strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-1234", "Kashish Barnwal");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(100);

        PaymentStrategy payPalPayment = new PayPalPayment("kash.barn@example.com");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200);
    }
}
