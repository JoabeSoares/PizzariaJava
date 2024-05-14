package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzaList;

    public Pedido() {
        this.pizzaList = new ArrayList<>();
    }


    // Adicionar pizza
    public void addPizza(Pizza pizza){
        pizzaList.add(pizza);
    }

    // Remover uma pizza
    public void removePizza(Pizza pizza){
        pizzaList.remove(pizza);
    }

    // Limpar o pedido
    public void eraseList(){
        pizzaList.clear();
    }

    // Preço total do pedido
    public double totalConta(){
        double total = 0.0;
        for (Pizza pizza : pizzaList) {
            total += pizza.getPreco();
        }
        return total;
    }
}
