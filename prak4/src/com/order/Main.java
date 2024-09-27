package com.order;

import com.payment.CreditCardPayment;
import com.payment.PayPalPayment;
import com.delivery.CourierDelivery;
import com.delivery.PostDelivery;
import com.notification.EmailNotification;
import com.notification.SMSNotification;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(new CreditCardPayment(), new CourierDelivery(), new EmailNotification());
        order1.addItem(new Item("Ноутбук", 1500));
        order1.processOrder();

        Order order2 = new Order(new PayPalPayment(), new PostDelivery(), new SMSNotification());
        order2.addItem(new Item("Мышь", 50));
        order2.processOrder();

    }
}

