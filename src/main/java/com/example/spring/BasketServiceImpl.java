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

    @Override
    public void add(Integer... itemID) {
        for (Integer id : itemID) {
            shoppingCart.getCardItems().add(id);
        }
    }
    @Override
    public List<Integer> get() throws JsonProcessingException {
        return List.copyOf(shoppingCart.getCardItems());
    }

}
