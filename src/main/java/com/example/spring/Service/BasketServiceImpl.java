package com.example.spring.Service;

import com.example.spring.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final List<Integer> productForId;

    public BasketServiceImpl(List<Integer> productForId) {
        this.productForId = productForId;
    }

    public Basket productAdd(int id) {
        Basket basket = new Basket(id);
        productForId.add(basket.getProductId());
        return basket;
    }

    public List<Integer> getProductForId() {
        return productForId;
    }

}
