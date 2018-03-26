package model;

import services.Movable;
import services.Toy;

public class ToyCar implements Toy, Movable {

    private double price ;
    private String color;

    public void move() {
        System.out.println("ToyCar: Start moving...");

    }

    public void setPrice(double price) {
        this.price = price;

    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Movable ToyCar{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
