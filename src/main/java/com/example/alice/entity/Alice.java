package com.example.alice.entity;

public class Alice {
    private Float height;
    private String location;

    public Alice() {
        this.height = 130F;
        this.location = "통로";
    }

    private void increaseHeight(float height) {
        this.height += height;
    }

    private void decreaseHeight(float height) {
        this.height -= height;
    }

    public void drinkBeverage(Beverage beverage, float quantity, float height) {
        beverage.drunk(quantity);
        decreaseHeight(height);
    }

    public void eatMushroom(Mushroom mushroom, float quantity, float height) {
        mushroom.eaten(quantity);
        decreaseHeight(height);
    }

    public void eatCake(Cake cake, float quantity, float height) {
        cake.eaten(quantity);
        increaseHeight(height);
    }

    public void useFan(float height) {
        increaseHeight(height);
    }

    public String crossDoor() {
        if (this.height > 40) {
            return "40CM 이하만 문을 통과할 수 있습니다.";
        }

        this.location = "아름다운 정원";

        return "아름다운 정원으로 이동했습니다.";
    }
}
