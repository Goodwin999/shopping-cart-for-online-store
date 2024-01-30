package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class CartShop {

    private final List<Integer> items;

    public CartShop() {
        items = new ArrayList<>();
    }

    public void add(Integer item) {
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
