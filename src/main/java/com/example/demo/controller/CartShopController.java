package com.example.demo.controller;

import com.example.demo.CartShop;
import com.example.demo.CartShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/order")
    public class CartShopController {

        private final CartShopService cartShopService;

        public CartShopController(CartShopService cartService) {
            this.cartShopService = cartService;
        }

        @RequestMapping("/add")
        public String add(@RequestParam List<Integer> items) {
            cartShopService.add(items);
            return "товар добавлен";
        }

        @RequestMapping("/get")
        public List<Integer> get() {
            return cartShopService.get();
        }
    }

