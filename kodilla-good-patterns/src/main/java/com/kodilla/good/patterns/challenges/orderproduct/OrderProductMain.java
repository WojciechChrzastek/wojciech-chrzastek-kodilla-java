package com.kodilla.good.patterns.challenges;

public class OrderProductMain {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.order();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}