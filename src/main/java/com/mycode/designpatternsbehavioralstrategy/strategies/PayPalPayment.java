package com.mycode.designpatternsbehavioralstrategy.strategies;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting Payment Details For PayPal...");
    }

    @Override
    public boolean isValidPaymentDetails() {
        System.out.println("Valid Payment Details For PayPal...");
        return true;
    }

    @Override
    public void pay(int cost) {
        System.out.println(cost + "LE Has Been Payed Using PayPal...");
    }
}
