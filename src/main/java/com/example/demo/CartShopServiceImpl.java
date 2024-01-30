package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartShopServiceImpl implements CartShopService {

    private final CartShop cart;

    public CartShopServiceImpl(CartShop cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Integer> items) {
        items.forEach(item -> cart.add(item));

    }

    @Override
    public List<Integer> get() {
        return cart.getItems();
    }
}