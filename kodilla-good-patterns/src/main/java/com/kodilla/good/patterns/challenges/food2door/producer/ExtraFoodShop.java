package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.OrderRequest;

public class ExtraFoodShop implements Producer {

    public String name;

    public String getName() {
        return name;
    }

    public ExtraFoodShop(String name) {
        this.name = name;
    }

    public void process(OrderRequest orderRequest) {
        System.out.println("Processing order: " + orderRequest + " for extra food shop");
    }
}
