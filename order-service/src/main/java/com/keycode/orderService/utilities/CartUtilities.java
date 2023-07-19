package com.keycode.orderService.utilities;

import com.keycode.orderService.domain.Product;

import java.math.BigDecimal;

public class CartUtilities {
    public static BigDecimal getSubTotalForItem(Product product, int quantity){
        return (product.getPrice()).multiply(BigDecimal.valueOf(quantity));
    }
}
