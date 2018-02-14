package com.kodilla.good.patterns.challenges.food2door.product;

import com.kodilla.good.patterns.challenges.food2door.user.User;

public class ProductOrderService {
        public boolean order (final User user, final Product product) {
        System.out.println("User " + user.getUsername() + " has ordered "+ product.getQuantity() + " " + product.getName() + ".");
        return true;
    }
}