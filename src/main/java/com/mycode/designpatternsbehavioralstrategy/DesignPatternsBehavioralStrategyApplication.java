package com.mycode.designpatternsbehavioralstrategy;

import com.mycode.designpatternsbehavioralstrategy.entities.Order;
import com.mycode.designpatternsbehavioralstrategy.strategies.CreditCardPayment;
import com.mycode.designpatternsbehavioralstrategy.strategies.PayPalPayment;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsBehavioralStrategyApplication {

    public static void main(String[] args) {

        Order order = new Order();
        order.setCost(50);

        System.out.println("Setting Payment Method As PayPal Method...");
        // setting payment strategy as PayPal strategy
        order.setPaymentMethod(new PayPalPayment());
        order.payForOrder();

        System.out.println("Setting Payment Method As Credit Card Method...");
        // setting payment strategy as Credit Card strategy
        order.setPaymentMethod(new CreditCardPayment());
        order.payForOrder();
    }

}
