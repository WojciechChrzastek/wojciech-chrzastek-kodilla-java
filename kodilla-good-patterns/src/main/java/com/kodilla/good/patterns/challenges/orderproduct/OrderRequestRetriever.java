package com.kodilla.good.patterns.challenges.orderproduct;

public class OrderRequestRetriever {
    public OrderRequest order() {

        User user = new User("John", "Doe");
        Product product = new Product("spoon");

        return new OrderRequest(user, product);
    }
}
