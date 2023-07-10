package com.example.spring;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface BasketService {
    void add(List<Integer> id);

    List<Integer> get() throws JsonProcessingException;
}

