package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.food2door.order.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.product.Product;
import com.kodilla.good.patterns.challenges.food2door.product.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.food2door.product.ProductOrderService;
import com.kodilla.good.patterns.challenges.food2door.user.User;

public class Food2DoorMain {
    public static void main(String[] args) {

        User user = new User("John Smith", "jsmith");
        Product product = new Product("spoon", 1);

        OrderProcessor orderProcessor = new OrderProcessor(
                new EmailService(),
                new EmailService(),
                new ProductOrderService(),
                new ProductOrderRepository());
        orderProcessor.process(new OrderRequest(user, product));
    }
}
