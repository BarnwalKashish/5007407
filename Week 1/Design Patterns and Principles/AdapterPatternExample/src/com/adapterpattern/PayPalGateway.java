// PayPalGateway.java
package com.adapterpattern;

public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using PayPal.");
    }
}

