package com.example.alice.trial;

public class Hatter implements Witness {
    private String location;

    public String getLocation() {
        return location;
    }

    @Override
    public void enter() {
        this.location = "재판장 안";
    }

    @Override
    public String testify() {
        return "증언";
    }
}
