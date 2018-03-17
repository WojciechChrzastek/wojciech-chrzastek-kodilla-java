package com.kodilla.good.patterns.challenges.food2door.product;

import com.kodilla.good.patterns.challenges.food2door.order.OrderRepository;
import com.kodilla.good.patterns.challenges.food2door.user.User;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product) {
        System.out.println("Adding new order to the database...");
        return true;
    }
}
