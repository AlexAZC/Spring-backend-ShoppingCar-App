package com.spring.shoppingcart.services.order;

import com.spring.shoppingcart.dto.OrderDto;
import com.spring.shoppingcart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
