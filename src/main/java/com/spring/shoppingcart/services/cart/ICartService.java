package com.spring.shoppingcart.services.cart;

import com.spring.shoppingcart.model.Cart;
import com.spring.shoppingcart.model.User;

import java.math.BigDecimal;

public interface ICartService {

    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long id);
}
