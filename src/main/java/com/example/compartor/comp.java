package com.example.compartor;

public class comp{
    int price;
    int speed;

    public comp(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "comp{" +
                "price=" + price +
                ", speed=" + speed +
                '}';
    }
}
