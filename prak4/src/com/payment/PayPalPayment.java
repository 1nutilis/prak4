package com.payment;

public class PayPalPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Оплата прошла через PayPal: $" + amount);
    }
}
