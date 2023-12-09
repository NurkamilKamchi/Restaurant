package models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
 private String name;
 private double price;
 private double time;
// public List<Menu> dishes = new ArrayList<>();
// public List<Menu> salads = new ArrayList<>();
// public List<Menu> drinks = new ArrayList<>();
// public List<Menu> desserts = new ArrayList<>();

    public Menu() {
    }

    public Menu(String name, double price, double time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "menu: " +
                "name: " + name +
                "  price: " + price +
                "  time: " + time +"\n\n";
    }
}
