package com.example.alice.entity;

public class Cake {
    private Float amount;

    public Cake() {
        this.amount = 10F;
    }

    public void eaten(float quantity) {
        this.amount += quantity;
    }
}
