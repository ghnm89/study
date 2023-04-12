package com.example.alice.entity;

public class Mushroom {
    private Float amount;

    public Mushroom() {
        this.amount = 10F;
    }

    public void eaten(float quantity) {
        this.amount -= quantity;
    }
}
