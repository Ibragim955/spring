package com.example.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("Request")
public class BasketServiceImpl extends BasketService {

        List<Basket> ids = new ArrayList<>();

        @Override
        public void add(List<Integer> lists) {

        }

        @Override
        public List<Integer> get() {
            ids.stream().map(e -> e.getIds());
            return null;
        }
    }

