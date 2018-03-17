package com.kodilla.good.patterns.challenges.orderproduct;

public class OrderRequest {
    public User user;
    public Product product;

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
}
