package com.spring.shoppingcart.dto;

import lombok.Data;
import java.math.BigDecimal;



@Data
public class OrderItemDto {

    private Long productId;
    private int quantity;
    private BigDecimal price;
    private String productName;
    private String productBrand;

}
