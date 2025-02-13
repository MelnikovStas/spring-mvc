package web.controller;

public class Car {
    private String model;
    private int cost;
    private String color;

    public Car(String model, int cost, String color) {
        this.model = model;
        this.cost = cost;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
