package com.payment;

public class CreditCardPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Оплата прошла через карту: " + amount + " $");
    }
}
