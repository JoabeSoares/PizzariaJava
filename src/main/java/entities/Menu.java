package entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // Criando a lista de pizzas
    List<String> listaPizzas = new ArrayList<>();

    // Adicionando as pizzas
    public void addPizza(String pizza) {
        listaPizzas.add(pizza);
    }

    public void removePizza(String pizza) {
        listaPizzas.remove(pizza);
    }

    public List<String> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(List<String> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public Menu() {
    }
}

