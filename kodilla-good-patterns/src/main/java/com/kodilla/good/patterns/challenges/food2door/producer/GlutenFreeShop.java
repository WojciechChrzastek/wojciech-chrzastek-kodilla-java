package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;

public class GlutenFreeShop implements Producer {

    public String name;

    public String getName() {
        return name;
    }

    public GlutenFreeShop(String name) {
        this.name = name;
    }

    public void process(OrderRequest orderRequest) {
        System.out.println("Processing order: " + orderRequest + " for gluten free shop");
    }
}
