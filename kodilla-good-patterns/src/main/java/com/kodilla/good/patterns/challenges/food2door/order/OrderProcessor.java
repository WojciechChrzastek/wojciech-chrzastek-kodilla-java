package com.kodilla.good.patterns.challenges.food2door.order;


import com.kodilla.good.patterns.challenges.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producer.Producer;
import com.kodilla.good.patterns.challenges.food2door.producer.ProducerInformationService;
import com.kodilla.good.patterns.challenges.food2door.product.ProductOrderService;
import com.kodilla.good.patterns.challenges.food2door.user.UserInformationService;

public class OrderProcessor {

    private OrderRepository orderRepository;
    private ProductOrderService productOrderService;
    private UserInformationService userInformationService;
    private ProducerInformationService producerInformationService;

    public OrderProcessor(final UserInformationService userInformationService,
                          final ProducerInformationService producerInformationService,
                          final ProductOrderService orderService,
                          final OrderRepository orderRepository) {
        this.userInformationService = userInformationService;
        this.producerInformationService = producerInformationService;
        this.productOrderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if(isOrdered) {
            userInformationService.informUser(orderRequest.getUser());
            Producer producer = new ExtraFoodShop("extra food shop");
            producerInformationService.informProducer(orderRequest.getProducer());
            producer.process(orderRequest);
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
