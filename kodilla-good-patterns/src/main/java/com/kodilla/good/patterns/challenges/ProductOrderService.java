package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService{
        public boolean order (final User user, final Product product) {
        System.out.println("Product" + " > " + product.getProductName() + " < " + "has been ordered by: " + user.getName() + " " + user.getSurname());
        return true;
    }
}




