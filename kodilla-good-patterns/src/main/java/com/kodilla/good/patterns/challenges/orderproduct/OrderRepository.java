package com.kodilla.good.patterns.challenges.orderproduct;

public interface OrderRepository {
    boolean createOrder(User user, Product product);
}
