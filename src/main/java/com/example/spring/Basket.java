package com.example.spring;

import java.util.List;
import java.util.Objects;

public class Basket {
    List<Integer> ids;

    public Basket(List<Integer> ids) {
        this.ids = ids;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String
    toString() {
        return "Basket{" +
                "ids=" + ids +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(ids, basket.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }
}

