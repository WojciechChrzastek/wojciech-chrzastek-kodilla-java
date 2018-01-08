package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product) {
        System.out.println("Adding new order to the database...");
        return true;
    }
}
