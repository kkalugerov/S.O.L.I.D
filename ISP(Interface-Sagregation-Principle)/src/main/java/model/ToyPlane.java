package model;

import services.Flyable;
import services.Movable;
import services.Toy;

public class ToyPlane implements Toy, Movable, Flyable {
    private double price;
    private String color;

    public void fly() {
        System.out.println("ToyPlane: Start flying plane.");
    }

    public void move() {
        System.out.println("ToyPlane: Start moving plane.");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
