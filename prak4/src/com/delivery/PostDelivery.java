package com.delivery;

import com.order.Order;

public class PostDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Доставлено на почту");
    }
}
