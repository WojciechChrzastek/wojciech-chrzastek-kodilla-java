package com.kodilla.good.patterns.challenges.food2door;


public class OrderProcessor {
    private UserInformationService userInformationService;
    private ProducerInformationService producerInformationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final UserInformationService userInformationService, final ProducerInformationService producerInformationService, final ProductOrderService orderService, final OrderRepository orderRepository) {
        this.userInformationService = userInformationService;
        this.producerInformationService = producerInformationService;
        this.productOrderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if(isOrdered) {
            userInformationService.informUser(orderRequest.getUser());
            userInformationService.informUser(orderRequest.getUser()); // tutaj ma być producerOrderService
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}