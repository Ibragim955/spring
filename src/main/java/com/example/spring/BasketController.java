package com.example.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/order")
public class BasketController {


        private final BasketService basketService;

        public BasketController(BasketService basketService) {
            this.basketService = basketService;
        }

    @GetMapping("/add")
    public void add(@RequestParam("id") Integer... itemID) {
        basketService.add(List.of(itemID));
    }

    @GetMapping("/get")
    public void get() throws JsonProcessingException {
    }
}


