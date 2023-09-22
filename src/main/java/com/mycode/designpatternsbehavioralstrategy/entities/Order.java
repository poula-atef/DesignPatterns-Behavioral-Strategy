package com.mycode.designpatternsbehavioralstrategy.entities;

import com.mycode.designpatternsbehavioralstrategy.strategies.PaymentMethod;
import lombok.Data;

@Data
public class Order {
    private int cost;
    private PaymentMethod paymentMethod;

    public void payForOrder() {
        paymentMethod.collectPaymentDetails();
        if (paymentMethod.isValidPaymentDetails()) {
            paymentMethod.pay(cost);
        }
    }
}
