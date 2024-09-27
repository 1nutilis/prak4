package com.delivery;
import com.order.Order;

public class CourierDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Доставлено курьером");
    }
}