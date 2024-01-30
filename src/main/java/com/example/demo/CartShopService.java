package com.example.demo;

import java.util.List;

public interface CartShopService {

    void add(List<Integer> items);

    List<Integer> get();
}