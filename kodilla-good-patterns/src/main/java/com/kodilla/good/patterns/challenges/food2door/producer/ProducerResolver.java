package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.product.Product;

public class ProducerResolver {
    public Producer resolveProducer(Product product) {
        return new ExtraFoodShop("Extra food shop");
    }
}