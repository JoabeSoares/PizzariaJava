package entities;

import java.util.ArrayList;
import java.util.List;
public class Menu {
    // Criando a lista de pizzas
    List<String> listOrderPizzas = new ArrayList<>();

    // Adicionando as pizzas
    public void addPizza(String pizza) {
        listOrderPizzas.add(pizza);
    }

    public void removePizza(String pizza) {
        listOrderPizzas.remove(pizza);
    }

    public List<String> getListPizzas() {
        return listOrderPizzas;
    }

    public void setListPizzas(List<String> listaPizzas) {
        this.listOrderPizzas = listaPizzas;
    }

    public void showMenu() {
        System.out.println("Estas são as nossas opções:\n" +
                "1 - MARGHERITA\n" +
                "2 - PEPPERONI\n" +
                "3 - CARNE DE SOL\n" +
                "4 - CALABRESA\n" +
                "5 - MISTA\n" +
                "-----------------------------" );
    }

    public void showSize() {
        System.out.println("Estes são os nossos tamanhos de pizza:\n" +
                "1 - Grande\n" +
                "2 - Média\n" +
                "3 - Pequena\n" +
                "4 - Brotinho\n" +
                "-----------------------------" );
    }
}

