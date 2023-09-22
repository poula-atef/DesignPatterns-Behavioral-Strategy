package com.mycode.designpatternsbehavioralstrategy.strategies;

public interface PaymentMethod {
    void collectPaymentDetails();

    boolean isValidPaymentDetails();

    void pay(int cost);
}
