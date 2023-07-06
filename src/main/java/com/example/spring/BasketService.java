package com.example.spring;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface BasketService {
    public static void add(List<Integer> id) {
    }

    void add(Integer... itemID);

    List<Integer> get() throws JsonProcessingException;
}
