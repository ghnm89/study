package com.example.alice.entity;

public class Beverage {
    private Float amount;

    public Beverage() {
        this.amount = 10F;
    }

    public void drunk(float quantity) {
        this.amount -= quantity;
    }
}
