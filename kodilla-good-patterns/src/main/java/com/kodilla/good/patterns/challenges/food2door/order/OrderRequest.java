package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.producer.Producer;
import com.kodilla.good.patterns.challenges.food2door.product.Product;
import com.kodilla.good.patterns.challenges.food2door.user.User;

public class OrderRequest {
    public User user;
    public Product product;
    public Producer producer;

    public OrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }
}
