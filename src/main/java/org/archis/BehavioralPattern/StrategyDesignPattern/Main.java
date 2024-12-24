package org.archis.BehavioralPattern.StrategyDesignPattern;

import org.archis.BehavioralPattern.StrategyDesignPattern.strategy.CreditCardStrategy;
import org.archis.BehavioralPattern.StrategyDesignPattern.strategy.PaypalStrategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("abc@xyz.com", "pwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Archisman Sahoo", "1234567890123456", "xxx", "12/15"));
    }
}
