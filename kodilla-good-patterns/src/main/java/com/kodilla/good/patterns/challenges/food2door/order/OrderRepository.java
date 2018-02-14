package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.product.Product;
import com.kodilla.good.patterns.challenges.food2door.user.User;

public interface OrderRepository {
    boolean createOrder(User user, Product product);
}
