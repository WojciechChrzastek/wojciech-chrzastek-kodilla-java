package com.kodilla.good.patterns.challenges.food2door.product;

import com.kodilla.good.patterns.challenges.food2door.user.User;
import com.kodilla.good.patterns.challenges.food2door.order.OrderRepository;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product) {
        System.out.println("Adding new order to the database...");
        return true;
    }
}