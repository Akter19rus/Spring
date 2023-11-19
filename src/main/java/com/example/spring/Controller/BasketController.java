package com.example.spring.Controller;

import com.example.spring.Service.BasketService;
import com.example.spring.model.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public Basket addOrder(@RequestParam int productId) {
        return basketService.productAdd(productId);
    }

    @GetMapping(path = "/get")
    public List<Integer> getOrder() {
        return basketService.getProductForId();
    }
}
