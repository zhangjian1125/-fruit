package com.jh.pojo;

import lombok.Data;

@Data
public class Fruit {
    private String fruits;
    private int price;

    public Fruit() {
    }

    public Fruit(String fruits, int price) {
        this.fruits = fruits;
        this.price = price;
    }
}
