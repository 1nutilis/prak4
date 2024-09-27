package com.order;

import com.delivery.CourierDelivery;
import com.delivery.IDelivery;
import com.delivery.PostDelivery;
import com.notification.EmailNotification;
import com.notification.INotification;
import com.notification.SMSNotification;
import com.payment.CreditCardPayment;
import com.payment.IPayment;
import com.payment.PayPalPayment;


import java.util.ArrayList;
import java.util.List;


public class Order {
    private final List<Item> items = new ArrayList<>();
    private IPayment payment;
    private IDelivery delivery;
    private INotification notification;

    public Order(IPayment payment, IDelivery delivery, INotification notification) {
        this.payment = payment;
        this.delivery = delivery;
        this.notification = notification;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }

        return new DiscountCalculator().applyDiscount(total);
    }

    public void processOrder() {
        notification.sendNotification("Заказ обработан");
        payment.processPayment(calculateTotalPrice());
        delivery.deliverOrder(this);
    }
}
