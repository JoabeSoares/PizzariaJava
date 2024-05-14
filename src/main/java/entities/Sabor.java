package entities;

import java.util.ArrayList;
import java.util.List;

public class Sabor {
    private String name;
    private double price;

    List<String> saboresList;

    Menu menu = new Menu();

    public void addSabor(String sabor){
        saboresList.add(sabor);
    }

    public Sabor() {
        this.saboresList = new ArrayList<String>();
    }
    // setters

    public void setName(String name) {
        this.name = name;
    }

    // getters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getSaboresList() {
        return saboresList;
    }
}
