package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.order.OrderRequest;

public interface Producer {
    void process(OrderRequest orderRequest);
}
