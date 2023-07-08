package com.example.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("Request")
public class BasketServiceImpl implements BasketService {

    private final ShoppingCart shoppingCart;

    public BasketServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    private final List<Integer> cart = new ArrayList<>();

    @Override
    public void add(List<Integer> ids) {
        cart.addAll(ids);
    }

    @Override
    public List<Integer> get() throws JsonProcessingException {
        return cart;
    }

}
