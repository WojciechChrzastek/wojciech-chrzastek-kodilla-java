package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {
    public OrderRequest order() {

        User user = new User("John Smith", "jsmith");
        Product product = new Product("spoon", 1);

        return new OrderRequest(user, product);
    }
}