package com.mycode.designpatternsbehavioralstrategy.strategies;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting Payment Details For Credit Card...");
    }

    @Override
    public boolean isValidPaymentDetails() {
        System.out.println("Valid Payment Details For Credit Card...");
        return true;
    }

    @Override
    public void pay(int cost) {
        System.out.println(cost + "LE Has Been Payed Using Credit Card...");
    }
}
