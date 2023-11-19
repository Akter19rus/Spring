package com.example.spring.Service;

import com.example.spring.model.Basket;

import java.util.List;

public interface BasketService {

    Basket productAdd(int productId);

    List<Integer> getProductForId();
}

