package com.example.spring;

import ch.qos.logback.core.BasicStatusManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Repository
@SessionScope
public class ShoppingCart {


    private List<Integer> cardItems;
    private ShoppingCart basketService;

    @PostConstruct
    public void Inside() {
        this.cardItems = cardItems;
    }

    public List<Integer> getCardItems() {
        return cardItems;
    }
}
