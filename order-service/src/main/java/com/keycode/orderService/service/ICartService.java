package com.keycode.orderService.service;

import com.keycode.orderService.domain.Item;

import java.util.List;

public interface ICartService {
    public void addItemToCart(String cartId, Long productId, Integer quantity);
    public List<Object> getCart(String cartId);
    public void changeItemQuantity(String cartId, Long productId, Integer quantity);
    public void deleteItemFromCart(String cartId, Long productId);
    public boolean checkIfItemIsExist(String cartId, Long productId);
    public List<Item> getAllItemsFromCart(String cartId);
    public void deleteCart(String cartId);
}
